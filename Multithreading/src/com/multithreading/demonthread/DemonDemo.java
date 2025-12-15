package com.multithreading.demonthread;

public class DemonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon());
		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		System.out.println(myThread.isDaemon());
		myThread.start();
		

	}

}
