package com.mani.java8.preticate;

import java.util.function.Predicate;

public class PreticateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p=i->(i<20);
		System.out.println(p.test(5));
		System.out.println(p.test(10));
		System.out.println(p.test(15));
		System.out.println(p.test(20));
		System.out.println(p.test(25));

	}

}
