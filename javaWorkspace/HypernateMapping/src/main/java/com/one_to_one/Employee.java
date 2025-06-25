package com.one_to_one;

import jakarta.persistence.*;

@Entity
@Table(name="emp200")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String name,email;
	@OneToOne(targetEntity=Address.class)
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
