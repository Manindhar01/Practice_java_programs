package com.mani.java.new_method_in_streamingapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,30,5,13,20,12,null);
		//System.out.println(list.stream().filter(x->x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().takeWhile(x->x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().dropWhile(x->x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()));
	}

}
