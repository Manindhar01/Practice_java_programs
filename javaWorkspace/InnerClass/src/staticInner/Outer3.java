package staticInner;

public class Outer3 {
	void f1() {
		System.out.println("Inside outer f1()");
		class LocalInner{
			void f2() {
				System.out.println("Inside localInner f2()");
			}
		}
		LocalInner li=new LocalInner();
		li.f2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 out=new Outer3();
		out.f1();

	}

}
