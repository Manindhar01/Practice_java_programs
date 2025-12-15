package com.multithreading.synchorinzation.intercommunication;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		
		synchronized(t) {
			System.out.println("Main Thread is going to wait");
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread Notified");
			System.out.println(t.total);
		}
		

	}

}
