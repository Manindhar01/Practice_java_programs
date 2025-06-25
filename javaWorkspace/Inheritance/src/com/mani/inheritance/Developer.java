package com.mani.inheritance;

public class Developer extends Employee {
	String technology;

	Developer(int id, String name, String dept, long salery, String technology) {
		super(id, name, dept, salery);
		this.technology=technology;
	}
	protected void work() {
		super.work();
		System.out.println("developer is working using"+technology);
	}

}
