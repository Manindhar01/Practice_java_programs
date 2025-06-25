package com.mani.java8.preticate;

import java.util.function.Predicate;

public class PreticateLengthOfString {
	public static void main(String[] args) {
		Predicate<String> p=s->(s.length()<5);
		System.out.println(p.test("abc"));
		System.out.println(p.test("abcde"));
		System.out.println(p.test("nm"));
	}

}
