package JavaCollections;

import java.time.LocalDate;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;
	
	public Employee(int id,String name,double salary,LocalDate joiningDate) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.joiningDate=joiningDate;
	}
	public int getId() {
		return id;
	}
	public void setID(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate=joiningDate;
	}

	@Override
	public int compareTo(Employee anotherEmployee) {
		return this.getId()-anotherEmployee.getId();
	}
	
	
	
	
	
}

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
