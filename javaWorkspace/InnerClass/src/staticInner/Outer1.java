package staticInner;

public class Outer1 {
	void f1() {
		System.out.println("outer class non static method");
		
	}
	
	class Inner{
		void f2() {
			System.out.println("inner class non static method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 ou=new Outer1();
		ou.f1();
		
		Outer1.Inner inner=ou.new Inner();
		inner.f2();

	}

}
