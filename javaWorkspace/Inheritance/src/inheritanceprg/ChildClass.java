package inheritanceprg;

public class ChildClass extends SuperClass {
	ChildClass(){
		this(10);
		System.out.println("no arg chid class constructor");
	}
	ChildClass(int x){
		super(x);
		System.out.println("args child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj=new ChildClass();

	}

}
