package com.many_to_one;

import jakarta.persistence.*;

@Entity
@Table(name="emp300")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	private Address address;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
