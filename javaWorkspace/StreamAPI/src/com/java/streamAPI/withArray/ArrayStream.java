package com.java.streamAPI.withArray;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,4,6,3,9,4,5};
		
		Arrays.stream(a)
		.sorted()
		.forEach(System.out::println);//this is piped stream
		
		System.out.println();
		
		OptionalDouble od=Arrays.stream(a)
		.average();
		System.out.println(od.getAsDouble());
		
		System.out.println();
		
		OptionalInt mx = Arrays.stream(a)
		.max();
		System.out.println(mx.getAsInt());
		
		System.out.println();
		
		OptionalInt mn=Arrays.stream(a).min();
		System.out.println(mn.getAsInt());
		
		System.out.println();
		
		OptionalInt first = Arrays.stream(a).findFirst();
		System.out.println(first.getAsInt());
		
		System.out.println();
		
		System.out.println();
		
		OptionalInt any = Arrays.stream(a).findAny();
		System.out.println(any.getAsInt());
		
		System.out.println();
		
		long count = Arrays.stream(a).count();
		System.out.println(count);
		
		System.out.println();
		
		Arrays.stream(a).distinct().forEach(System.out::println);
		
		System.out.println();
		
		Arrays.stream(a).filter(no->no%3==0).forEach(System.out::println);
		
		

	}

}
