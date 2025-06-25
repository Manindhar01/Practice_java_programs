package com.deprecated;

import java.util.ArrayList;
import java.util.List;

public class B {
	@SuppressWarnings(value = {  "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.method();
		
		@SuppressWarnings("rawtypes")
		List list=new ArrayList();
		System.out.println(list);

	}

}
