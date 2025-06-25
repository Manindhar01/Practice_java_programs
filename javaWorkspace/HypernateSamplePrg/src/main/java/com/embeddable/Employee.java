package com.embeddable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private EmployeeName empName;
	private String role;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public EmployeeName getEmpName() {
		return empName;
	}
	public void setEmpName(EmployeeName empName) {
		this.empName = empName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
