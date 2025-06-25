package com.many_to_many;

import java.util.List;

import jakarta.persistence.*;
@Entity
@Table(name="qst101")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String qname;
	
	@ManyToMany(targetEntity=Answer.class,cascade= {CascadeType.ALL})
	@JoinTable(name="q_ans101",
			joinColumns= {@JoinColumn(name="q_id")},
			inverseJoinColumns= {@JoinColumn(name="a_id")})
	private List<Answer> answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

}
