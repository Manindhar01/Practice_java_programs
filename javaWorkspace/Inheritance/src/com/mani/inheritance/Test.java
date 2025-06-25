package com.mani.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] project = new String[] {"Flight reservation","checkIn"};
		Manager obj=new Manager(12,"karthi", "travel",120000,project);
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.dept);
		System.out.println(obj.salery);
		System.out.println(obj.project);
		obj.work();
		Developer developer = new Developer(23, "manindhar","travel",25000, "full stack java developer");
		developer.work();

	}

}
