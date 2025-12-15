package com.multithreading.yield;

public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
	
	//Thread.yield() lets the currently running thread voluntarily pause and give a chance for other threads of 
	//equal priority to run. It does not guarantee anything and may be ignored by the OS.

}
