package com.mani.inheritance;

public class Employee {
	int id;
	String name;
	String dept;
	long salery;
	
	Employee(int id,String name, String dept, long salery){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salery=salery;
	}
	protected void work() {
		System.out.println("common work for everyone");
	}

}
