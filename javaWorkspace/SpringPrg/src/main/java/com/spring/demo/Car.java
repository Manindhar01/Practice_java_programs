package com.spring.demo;

public class Car {
	private String name;
	private String type;
	
	Car(String type){
		this.type=type;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void drive() {
		System.out.println(getName()+" "+ type+" "+"car is moving");
	}

}
