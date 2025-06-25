package com.mani.java.re;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/"
				+ "C:/Users/bzf/Documents/sample");
		String[] filename=file.list();
		Pattern pattern=Pattern.compile("[a-zA-Z0-9]+[.]txt");
		int count=0;
		
		for(String filenames:filename) {
			Matcher matcher=pattern.matcher(filenames);
			count++;
			if(matcher.matches()) {
				System.out.println(filename);
			}
		}
		System.out.println("number of txt files: "+count
				);

	}

}
