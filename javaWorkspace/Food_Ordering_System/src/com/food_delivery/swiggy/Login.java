package com.food_delivery.swiggy;

import java.util.Scanner;

public class Login {
	 String email;
	 String password;
	
	public void verify() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter email");
		email=s.next();
		System.out.println("Enter Password");
		password=s.next();
		if(email.matches("^_[a-z0-A-z9.]+@[a-zA-Z0-9._]+$")&&password.matches("[a-zA-Z0-9@#$&]{8,12}")) {
			System.out.println("Login successfull");
			System.out.println("\nWELCOME TO SWIGGY!");
			FoodMenu.menu();
		}
		else 
		{
			System.out.println("invalid please check your email and password");
			verify();
		}

		
		
		
	}

}
