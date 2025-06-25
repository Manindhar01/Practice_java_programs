package Mutithreading_Example;

public class RunnableInterfaceDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterfaceDemo ri=new RunnableInterfaceDemo();
		Thread t=new Thread(ri);
		t.start();

	}

	@Override
	public void run() {
		System.out.println("hi guys");
		
	}

}
