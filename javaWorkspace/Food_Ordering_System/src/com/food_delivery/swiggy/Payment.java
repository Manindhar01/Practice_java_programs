package com.food_delivery.swiggy;

import java.util.Scanner;

public class Payment {
	
	public static void payment() {
		Scanner s=new Scanner(System.in);
		System.out.println("\nCash On Delivery enter 1");
		System.out.println("Gpay enter 2");
		System.out.println("CreditCard enter 3");
		int i=s.nextInt();
		
		if(i==1) {
			System.out.println("you select cash on delivery ");
			System.out.println("enter true to conform and false to cancel");
			boolean a=s.nextBoolean();
			if(a==true) {
				System.out.println("your Order has been completed");
			}else {
				System.out.println("your order has been canceled");
			}
		}
			
			if(i==2) {
				System.out.println("you select Gpay ");
				System.out.println("enter true to conform and false to cancel");
				boolean b=s.nextBoolean();
				if(b==true) {
					System.out.println("your Order has been completed");
				}else {
					System.out.println("your order has been canceled");
				}
			}
				
				if(i==3) {
					System.out.println("you select CreditCard ");
					System.out.println("enter true to conform and false to cancel");
					boolean c=s.nextBoolean();
					if(c==true) {
						System.out.println("your Order has been completed");
					}else {
						System.out.println("your order has been canceled");
					}
				}
			
		
				}
			}


