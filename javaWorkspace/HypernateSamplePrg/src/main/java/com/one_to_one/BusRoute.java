package com.one_to_one;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BusRoute {
	@Id
	private int busNo;
	private String busRoute;
	
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getBusRoute() {
		return busRoute;
	}
	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}

}
