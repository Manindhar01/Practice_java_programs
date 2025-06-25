package com.mani.java.try_with_resources;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWorker mw=new MyWorker();
		try(mw){
		mw.doSomething();
		}catch(Exception e) {
			
		}

	}

}
