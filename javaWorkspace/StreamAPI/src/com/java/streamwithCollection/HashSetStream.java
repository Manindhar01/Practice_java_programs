package com.java.streamwithCollection;

import java.util.HashSet;

public class HashSetStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(55);
		hs.add(29);
		hs.add(42);
		
		hs.stream().limit(2).forEach(System.out::println);//it will print any two element

	}

}
