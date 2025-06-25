package com.mani.java.re;

import java.util.regex.Pattern;

public class CharacterAndQuantifers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[abc]*","ddd"));
		System.out.println(Pattern.matches("\\d","6"));
		System.out.println(Pattern.matches("\\D", "7"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "Hw12e"));

	}

}
