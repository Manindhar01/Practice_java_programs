package com.multithreading.synchorinzation.classlock;

public class SynchoronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mt1 = new MyThread("Ajith");
		MyThread mt2 = new MyThread("Vijay");
		
		mt1.start();
		mt2.start();

	}

}
