package com.mani.inheritance;

public class Manager extends Employee {
	String[] project;

	Manager(int id, String name, String dept, long salery, String[] project) {
		super(id, name, dept, salery);
		this.project=project;
	}


protected void work() {
	super.work();
	System.out.println("manager is managing");
	for(int i=0;i<=project.length;i++) {
		System.out.println(project[i]);
	}
}
}