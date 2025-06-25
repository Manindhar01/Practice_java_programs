package com.mani.inheritance;

public class Tester extends Employee {
	String[] tools;

	Tester(int id, String name, String dept, long salery, String tools[]) {
		super(id, name, dept, salery);
		this.tools=tools;
	}
	
	protected void work() {
		super.work();
		System.out.println("Tester is testing using");
		for(int i=0;i<=tools.length;i++) {
			System.out.println(tools[i]);
		}
	}

}
