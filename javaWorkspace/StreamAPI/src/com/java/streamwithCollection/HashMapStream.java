package com.java.streamwithCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("sanjay",150);
		hm.put("vinalan", 100);
		hm.put("swami", 200);
		hm.put("gopi", 250);
		
		hm.keySet().stream().forEach(System.out::println);//it will print all element
		
		System.out.println();
		
		hm.keySet().stream().sorted().forEach(System.out::println);//it will sort ascending order and print all element
		
		System.out.println();
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println();
		
		Set<String> collect = hm.keySet().stream().collect(Collectors.toSet());
		System.out.println(collect);
		
		System.out.println();
		
		boolean anyMatch = hm.keySet().stream().anyMatch(name->name.endsWith("i"));
		System.out.println(anyMatch);
		
		System.out.println();
		
		boolean allMatch = hm.keySet().stream().allMatch(name->name.endsWith("i"));
		System.out.println(allMatch);
		
		System.out.println();
		
		boolean noneMatch = hm.keySet().stream().noneMatch(name->name.endsWith("o"));
		System.out.println(noneMatch);
		
		

	}

}
