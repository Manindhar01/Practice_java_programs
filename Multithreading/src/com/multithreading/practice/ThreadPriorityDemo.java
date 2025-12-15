package com.multithreading.practice;

public class ThreadPriorityDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPriorityDemo tp1 = new ThreadPriorityDemo();
		tp1.setPriority(MIN_PRIORITY);
		tp1.setName("tp1");
		tp1.start();
		
		ThreadPriorityDemo tp2 = new ThreadPriorityDemo();
		tp2.setPriority(MAX_PRIORITY);
		tp2.setName("tp2");
		tp2.start();

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}

}
