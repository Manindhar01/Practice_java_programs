package com.query_interface;

import jakarta.persistence.*;

//@NamedQuery(name = "GetRecordByName", query = "select Student s where s.name=:n")

@Entity
public class Student {
	@Id
	private int rollNum;
	private String name;
	private int mark;
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}

}
