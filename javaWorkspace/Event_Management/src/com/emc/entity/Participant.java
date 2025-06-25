package com.emc.entity;

public class Participant extends EMbase {
	public String email;
	public boolean checkedIn;
	
	public Participant(long id, String name, String email, boolean checkedIn) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.checkedIn=checkedIn;
		
	}
	

}
