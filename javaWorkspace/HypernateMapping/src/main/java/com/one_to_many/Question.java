package com.one_to_many;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="qst100")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String qname;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="qid")
	@OrderColumn(name="type")
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
	public void setAnswer(ArrayList<Answer> al) {
		this.answer = al;
	}
	

}
