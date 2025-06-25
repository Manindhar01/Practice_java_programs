package examp;


public class SingleInheritance {

	void meth() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj=new SingleInheritance();
		obj.meth();
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		

	}

}
