package com.mani.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-B0-9_.-]+$");
		Matcher matcher=pattern.matcher("Mani.mani@gmail.com");
		if(matcher.find()) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Invalid Email");
		}

	}

}
