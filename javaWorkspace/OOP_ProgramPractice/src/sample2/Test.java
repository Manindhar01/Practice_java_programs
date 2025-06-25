package sample2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee("Sanjay","FrontEnd Developer",25000);
		Employee obj1=new Employee("Hari","BackEnd Developer",35000);
		System.out.println("Employee details");
		System.out.println();
		obj.printEmployeeDetails();
		System.out.println();
		obj1.printEmployeeDetails();
		obj.riseSalary(5);
		obj1.riseSalary(10);
		System.out.println();
		System.out.println("your updated salary");
		System.out.println();
		obj.printEmployeeDetails();
		System.out.println();
		obj1.printEmployeeDetails();
		

	}

}
