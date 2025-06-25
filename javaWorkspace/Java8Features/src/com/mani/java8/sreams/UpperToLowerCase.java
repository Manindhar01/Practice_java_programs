package com.mani.java8.sreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		l1.add("MANI");
		l1.add("HARI");
		l1.add("SANJAY");
		
		System.out.println(l1);
		
		List<String> l2=l1.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		
		
	}

}
