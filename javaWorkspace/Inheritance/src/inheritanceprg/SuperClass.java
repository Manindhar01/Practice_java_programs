package inheritanceprg;

public class SuperClass {
	
	int x;
	
	public SuperClass() {
		System.out.println("no args super class constructor");
	}
	
	public SuperClass(int x) {
		this();
		this.x=x;
		System.out.println("one argument super class constructor");
	}

}
