package com.mani.java8.preticate;

import java.util.function.Predicate;

public class PreticateJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {5,4,12,3,56,9,20,30,7};
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		System.out.println("greater than 10:");
	    method1(p1, x);
	    System.out.println("even numbers are:");
	    method1(p2,x);
	    System.out.println("Not greater than 2");
	    method1(p1.negate(),x);
	    System.out.println("greater than 10 AND Even:");
	    method1(p1.and(p2),x);
	    System.out.println("greater than 10 OR Even:");
	    method1(p1.or(p2),x);
		

	}
	static void method1(Predicate<Integer>p,int[]x) {
		for(int eachvalue:x) {
			if(p.test(eachvalue)) {
				System.out.println(eachvalue);
			}
		}
	}

}
