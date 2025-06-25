package com.mani.java.immutable_collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("abc", "123", "def");
		Set<String> set = Set.of("hi", "hello", "you");
		Map<Integer, String> map = Map.of(01,"mani", 02, "hari");
		System.out.println(map);
	}

}
