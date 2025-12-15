package com.multithreading.practice;

public class SingleThreaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreaded singleThreaded = new SingleThreaded();
		singleThreaded.demo();
		for(int j=1;j<=100;j++) {
			System.out.print("j="+j);
		}

	}
	
	public void demo() {
		for(int i=1;i<=100;i++) {
			System.out.print("i="+i);
	}
	}

}
