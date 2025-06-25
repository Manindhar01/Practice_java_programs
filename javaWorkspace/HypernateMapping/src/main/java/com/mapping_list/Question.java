package com.mapping_list;

import java.util.List;

import jakarta.persistence.*;
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String question;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name="Answer",
	joinColumns=@JoinColumn(name="qid"),
	inverseJoinColumns=@JoinColumn(name="type"))
	@OrderColumn(name="type")
	private List<String> answer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}

}
