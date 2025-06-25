package oopConcept;

class A {
	int a;

	int getA() {
		return a;
	}
}

class B extends A {
	int b;

	int getB() {
		return b;
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob = new B();
		ob.a = 10;
		ob.b = 20;
		System.out.println(ob.a + " " + ob.b);

	}

}
