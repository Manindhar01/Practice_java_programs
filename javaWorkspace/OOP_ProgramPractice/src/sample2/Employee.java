package sample2;

public class Employee {
	
	private String name;
	private String jobTitle;
	private double salary;
	
	Employee(String name,String jobTitle,double salary){
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	
	void setjobTitle(String jobTitle) {
		this.jobTitle=jobTitle;
	}
	
	String getjobTitle() {
		return jobTitle;
	}
	
	void setSalary(int salary) {
		this.salary=salary;
	}
	
	double getSalary() {
		return salary;
	}
	
	public void riseSalary(double percentage) {
		salary=salary+salary*percentage/100;
	}
	public void printEmployeeDetails() {
		System.out.println("Name: "+name);
		System.out.println("Job Title: "+jobTitle);
		System.out.println("Salary: "+salary);
	}
	

}
