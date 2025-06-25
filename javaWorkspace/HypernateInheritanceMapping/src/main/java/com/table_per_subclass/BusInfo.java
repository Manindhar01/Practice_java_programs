package com.table_per_subclass;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class BusInfo extends StudentInfo{
	private int busNO;
	private String busFrom;
	private String busTo;
	public int getBusNO() {
		return busNO;
	}
	public void setBusNO(int busNO) {
		this.busNO = busNO;
	}
	public String getBusFrom() {
		return busFrom;
	}
	public void setBusFrom(String busFrom) {
		this.busFrom = busFrom;
	}
	public String getBusTo() {
		return busTo;
	}
	public void setBusTo(String busTo) {
		this.busTo = busTo;
	}

}
