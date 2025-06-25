package synchronization.classlock;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMessage dm=new DisplayMessage();
		
		MyThread t1=new MyThread("hari");
		MyThread t2=new MyThread("Sanjay");
		t1.start();
		t2.start();

	}

}
