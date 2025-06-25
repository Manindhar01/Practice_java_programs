package Mutithreading_Example;

public class ThreadIdentity extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadIdentity ti=new ThreadIdentity();
		ti.start();
		Thread currentThread=Thread.currentThread();
		System.out.println("thread name is:"+currentThread.getName());

	}
	public void run() {
		Thread currentThread=Thread.currentThread();
		currentThread.setName("hi hello");
		System.out.println("Thread name is:"+currentThread.getName());
	}

}
