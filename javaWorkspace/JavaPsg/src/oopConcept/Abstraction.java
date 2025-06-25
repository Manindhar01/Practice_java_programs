package oopConcept;

abstract class A11 {
	 void callme() {
		 System.out.println("inside A11 ");
	 }
}

class B11 extends A11 {
	void callme() {
		System.out.println("Inside B11");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B11 ob = new B11();
		A11 a;
		a = ob;
		System.err.println(a == ob );//==> true/false
		System.err.println((a.equals(ob)));///  true/false
		ob.callme();
		a.callme();

	}

}
