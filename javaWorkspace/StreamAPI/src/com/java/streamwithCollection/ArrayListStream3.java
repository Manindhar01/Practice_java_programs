package com.java.streamwithCollection;

import java.util.ArrayList;
import java.util.List;

class Employee{
	
	String name;
	int salary;
	Employee(String getName, int getSalary){
		this.name=getName;
		this.salary=getSalary;
		
	}
}

public class ArrayListStream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> al=new ArrayList<>();
		Employee emp1=new Employee("hari",2000);
		Employee emp2=new Employee("chandru",7000);
		Employee emp3=new Employee("hema",5000);
		Employee emp4=new Employee("sanjay",6000);
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		
		al.stream().filter(emp->emp.salary>4000).map(emp->emp.name).forEach(System.out::println);//it will filter salary above 4000

	}

}
