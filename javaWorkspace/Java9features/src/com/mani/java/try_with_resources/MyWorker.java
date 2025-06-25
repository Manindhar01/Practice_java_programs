package com.mani.java.try_with_resources;

public class MyWorker implements AutoCloseable {
	
	MyWorker(){
		System.out.println("creating the resource");
	}
	public void doSomething() {
		System.out.println("Doing Something");
	}

	@Override
	public void close() throws Exception {
		System.out.println("closing the resource");
		
	}
	

}
