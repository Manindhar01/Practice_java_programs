package com.food_delivery.swiggy;

import java.util.Scanner;

public class Order{
	
	
	public static void placeOrder() {
		Scanner s=new Scanner(System.in);
		System.out.println("\nPLACE ORDER");
		System.out.println("Enter your name");
		String Name=s.next();
		System.out.println("Enter your Mobile no");
		int mobileNo=s.nextInt();
		System.out.println("Enter your Address");
		String Address=s.next();
		Payment.payment();
		
		
	}
	
	
	
	

}
