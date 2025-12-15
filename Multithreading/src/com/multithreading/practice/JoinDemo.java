package com.multithreading.practice;

import java.util.Scanner;

public class JoinDemo extends Thread{
	
	static int n,sum=0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = Thread.currentThread();
		System.out.println("Thread Name:"+thread.getName());
		long start = System.currentTimeMillis();
		
		System.out.println("Calulate sum of N numbers");
		System.out.println("Enter a value");
		Scanner s = new Scanner(System.in);
		JoinDemo.n = s.nextInt();
		JoinDemo joinDemo = new JoinDemo();
		joinDemo.start();
		try {
			joinDemo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The sum of "+n+" is "+sum);
		
		long end = System.currentTimeMillis();
		
		System.out.println("Total time taken "+(end-start)/1000+" Seconds");
		

	}
	
	public void run() {
		
		Thread thread = Thread.currentThread();
		thread.setName("Sum Number");
		System.out.println("Thread Name:"+thread.getName());
		
		for(int i=1;i<=JoinDemo.n;i++) {
			JoinDemo.sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
