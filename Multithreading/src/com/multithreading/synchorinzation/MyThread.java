package com.multithreading.synchorinzation;

public class MyThread extends Thread {
	
	String name;
	DisplayMessage dm;
	
	MyThread(String name, DisplayMessage dm){
		this.name=name;
		this.dm=dm;
	}
	
	@Override
	public void run() {
		dm.sayHello(name);

}
}
