package javaThread;



public class ThreadExample extends Thread {
	
	public void run() {
		System.out.println("Inside:"+Thread.currentThread().getName());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside:"+Thread.currentThread().getName());
		System.out.println("creating thread...");
		

	}

}
