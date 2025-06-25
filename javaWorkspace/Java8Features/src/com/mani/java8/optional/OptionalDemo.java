package com.mani.java8.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> empty=Optional.empty();
		System.out.println("isPresent:"+empty.isPresent());
		Optional<String> data=Optional.of("this is optional program");
		System.out.println("is present:"+data.isPresent());
		System.out.println(data.get());
		if(empty.isPresent()) {
		System.out.println(empty.get());
		}
		
		System.out.println(data.filter((s)->s.equals("this is optional program")));
		System.out.println(data.filter((s1)->s1.equals("is optional program")));
		
		System.out.println(data.orElse("default value"));
		System.out.println(empty.orElse("default value"));

		data.ifPresent(System.out::println);
	}

}
