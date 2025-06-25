package com.java.streamwithCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(35);
		al.add(20);
		
		System.out.println(al.stream().count());//it will count
		
		System.out.println();
		
		al.stream().distinct().forEach(System.out::println);//it will remove duplicate
		
		System.out.println();
		
		al.stream().distinct().sorted().forEach(System.out::println);//it will remove duplicate and sort ascending order
		
		System.out.println();
		
		al.stream().map(m->m/2).forEach(System.out::println);//it will divide each value by 2
		
		System.out.println();
		
		al.stream().limit(3).skip(2).forEach(System.out::println);//it will print 3value and skip 2
		
		System.out.println();
		
		Optional<Integer> reduce = al.stream().reduce((x,y)->x+y);//it will add all the element of list
		System.out.println(reduce.get());
		
		System.out.println();
		
		Object[] array = al.stream().toArray();//it will convert arraylist to array
		for(Object x:array) {
			System.out.println(x);
		}
		
		System.out.println();
		
		Optional<Integer> max = al.stream().max((x,y)->x.compareTo(y));//it will compare all the value and find maximum value
		System.out.println(max.get());
		
		System.out.println();
		
		al.parallelStream().forEachOrdered(System.out::println);//parallel stream works parallel the output will be unordered and you will get orderd use (foreachOrdered)
		System.out.println();
		
		
		
		List<String> as=new ArrayList<>();
		as.add("Hari");
		as.add("Sanjay kumar");
		as.add("Sakthi");
		as.add("Manindhar");
		
		as.stream().distinct().sorted((ele1,ele2)->ele1.compareTo(ele2)).forEach(System.out::println);//it will remove dublicate and compare two element to sort
		
		System.out.println();
		
		as.stream().map(m->m.toUpperCase()).forEach(System.out::println);//it will uppercase to each element

	}

}
