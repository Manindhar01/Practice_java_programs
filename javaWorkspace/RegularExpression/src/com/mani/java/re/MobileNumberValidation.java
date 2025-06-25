package com.mani.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern=Pattern.compile("^\\d{10}$");
		Matcher matcher=pattern.matcher("8430440823");
		if(matcher.find()) {
			System.out.println("Valid Mobile Number");
		}else {
			System.out.println("Invalid Mobile Number");
		}

	}

}
