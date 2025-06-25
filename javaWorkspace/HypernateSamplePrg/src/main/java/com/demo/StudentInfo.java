package com.demo;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  

public class StudentInfo {
	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", rollNumber=" + rollNumber + ", Name=" + Name + ", studLap="
				+ studLap + "]";
	}
	@Id
	private int studentId;
	private String rollNumber;
	private String Name;
	@OneToOne
	private Laptop studLap;
	
	public Laptop getStudLap() {
		return studLap;
	}
	public void setStudLap(Laptop studLap) {
		this.studLap = studLap;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
