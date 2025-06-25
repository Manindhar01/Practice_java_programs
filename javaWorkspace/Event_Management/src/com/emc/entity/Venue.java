package com.emc.entity;

public class Venue extends EMbase {
	public String description;
	public String streetAddress;
	public String city;
	public String state;
	public String country;
	public int pincode;
	
	public  Venue(long id,String name, String description, String streetAddress, String city, String state, String country, int pincode) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.streetAddress=streetAddress;
		this.city=city;
		this.state=state;
		this.country=country;
		this.pincode=pincode;
	}

}
