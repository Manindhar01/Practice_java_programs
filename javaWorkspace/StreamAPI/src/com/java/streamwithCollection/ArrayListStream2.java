package com.java.streamwithCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al=new ArrayList<>();
		al.add("vinalan");
		al.add("hema");
		al.add("sanjay");
		al.add("hari");
		
		al.stream().map(m->m.toUpperCase()).forEach(System.out::println);//it change all element to uppercase
	}

}
