/**
 * 
 */
package com.multithreading.interrupt;

/**
 * 
 */
public class InterruptDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
		

	}

}
