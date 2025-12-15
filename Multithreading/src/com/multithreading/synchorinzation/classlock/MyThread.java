package com.multithreading.synchorinzation.classlock;

public class MyThread extends Thread {
	
	String name;
	DisplayMessage dm;
	
	MyThread(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		DisplayMessage.sayHello(name);

}
}
