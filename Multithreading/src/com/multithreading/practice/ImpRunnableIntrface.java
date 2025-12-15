package com.multithreading.practice;

public class ImpRunnableIntrface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Processed to check");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpRunnableIntrface ir = new ImpRunnableIntrface();
		Thread thread = new Thread(ir);
		thread.start();

	}

}
