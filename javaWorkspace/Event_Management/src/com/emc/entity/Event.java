package com.emc.entity;

public class Event extends EMbase{
	
	public String description;
	public String startTime;
	public String endTime;
	public boolean started;
	
	public Event(long id,String name,String description,String startTime,String endTime, boolean started) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.startTime=startTime;
		this.endTime=endTime;
		this.started=started;
	}
	
	

}
