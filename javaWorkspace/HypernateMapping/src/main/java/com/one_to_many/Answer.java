package com.one_to_many;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="ans100")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String answerName;
	private String postedBy;
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

}
