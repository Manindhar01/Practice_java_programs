package oopConcept;

class Demo1{
	int a=5;
	int meth1() {
		return a;
	}
	String meth1(String s) {
		return s;
	}
}

public class MethodOverloadingPolymophirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj=new Demo1();
		System.out.println(obj.meth1());
		System.out.println(obj.meth1("Apple"));

	}

}
