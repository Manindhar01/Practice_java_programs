package com.multithreading.synchorinzation.block;

public class SynchoronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMessage dm = new DisplayMessage();
		
		MyThread mt1 = new MyThread("Ajith",dm);
		MyThread mt2 = new MyThread("Vijay",dm);
		
		mt1.start();
		mt2.start();

	}

}
