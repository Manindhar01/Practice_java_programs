package yield;

public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		mt.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}

	}

}
