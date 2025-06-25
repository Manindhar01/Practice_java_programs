package oopConcept;

class A1{
	void meth1() {
		System.out.println("this is super class");
	}
}
class B1 extends A1{
	void meth1() {
		System.out.println("this is sub class");
	}
}

public class MethodOverridingPolymorphirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 ob=new B1();
		ob.meth1();

	}

}
