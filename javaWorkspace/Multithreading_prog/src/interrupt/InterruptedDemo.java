package interrupt;

public class InterruptedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		mt.start();
		mt.interrupt();
		System.out.println("end of main method");

	}

}
