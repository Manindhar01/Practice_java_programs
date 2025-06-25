package com.mani.java.re;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern=Pattern.compile("\\s");
		String[] text=pattern.split("hi.how.are.you");
		
		String s="www.mani.com";
		String[] text2=s.split("\\.");
		for(String texts:text2) {
			System.out.println(texts);
		}

	}

}
