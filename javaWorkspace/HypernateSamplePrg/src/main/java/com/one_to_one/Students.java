package com.one_to_one;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Students {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stdId;
	private String name;
	@OneToOne
	private BusRoute busId;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BusRoute getBusId() {
		return busId;
	}
	public void setBusId(BusRoute busId) {
		this.busId = busId;
	}
	

}
