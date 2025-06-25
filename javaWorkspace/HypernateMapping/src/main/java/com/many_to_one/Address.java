package com.many_to_one;

import jakarta.persistence.*;

@Entity
@Table(name="addr300")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String addressLine1,city,state,country;
	private int pinCode;
	@OneToOne(cascade=CascadeType.ALL)
	private Employee employee;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmloyee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

}
