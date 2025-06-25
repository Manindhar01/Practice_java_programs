package prg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new C();
		a.myMethod();
		
		A b=()->System.out.println("Inside myMethod");
		b.myMethod();
		

	}

}
