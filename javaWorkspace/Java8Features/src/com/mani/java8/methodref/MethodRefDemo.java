package com.mani.java8.methodref;

public class MethodRefDemo {
	
	public static void method1() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=MethodRefDemo::method1;
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("parent thread");
		}

	}

}
