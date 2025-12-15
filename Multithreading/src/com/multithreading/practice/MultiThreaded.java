package com.multithreading.practice;

public class MultiThreaded extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiThreaded multiThreaded = new MultiThreaded();
		multiThreaded.start();
		for(int j=1;j<=100;j++) {
			System.out.print("j="+j+" ");
			Thread.sleep(1000);
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			System.out.print("i="+i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
