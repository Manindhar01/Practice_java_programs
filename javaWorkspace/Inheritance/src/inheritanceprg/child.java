package inheritanceprg;

public class child extends parent {
	
	int c,d;
	child(int a,int b,int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	
	void displayDetails() {
		System.out.println("parent a:"+super.a);
		System.out.println("parent b:"+super.b);
		System.out.println("child c:"+c);
		System.out.println("child d:"+d);
	}
	
	void f1() {
		super.f1();
		System.out.println("inside f1 method child class");
	}

}
