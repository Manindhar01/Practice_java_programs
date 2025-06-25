package staticInner;

public class Outer2 {
	private static int x=50;
	private int y;
	
	Outer2(int y){
		this.y=y;
	}
	void f1(){
		System.out.println("outer class are non static method");
	}
	class Inner{
		private int y;
		
		Inner(int y){
			this.y=y;
		}
		private void f2() {
			System.out.println("outer classes x:"+Outer2.x);
			System.out.println("Outer class y:"+Outer2.this.y);
			System.out.println("Inner class y:"+this.y);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out=new Outer2(10);
		out.f1();
		
		Inner inner=out.new Inner(30);
		inner.f2();
		
		

	}

}
