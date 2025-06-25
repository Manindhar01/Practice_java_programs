package com.mani.java.re;

public class StringEmailValidater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="mani.mani12@gmail.com";
		if(email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")) {
			System.out.println("Valid email");
		}else {
			System.out.println("Invalid email");
		}

	}

}
