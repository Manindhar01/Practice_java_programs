package com.multithreading.synchorinzation.deadlocks;

public class DeadlockDemo implements Runnable{
	
	FirstResource fr=new FirstResource();
	SecondResource sr= new SecondResource();
	
	public DeadlockDemo() {
		new Thread(this).start();
		sr.method1(fr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeadlockDemo();

	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		fr.method1(sr);
		
	}

}
