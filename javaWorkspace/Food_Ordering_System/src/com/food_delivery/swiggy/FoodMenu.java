package com.food_delivery.swiggy;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodMenu {
	public static void menu() {
		
		System.out.println("\nToday Specials");
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Idly");
		hm.put(2,"Dosa");
		hm.put(3,"pori");
		hm.put(4,"pogal");
		for(Map.Entry<Integer,String> m:hm.entrySet()) {
			System.out.println(m);
		}
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==1) {
			System.out.println(hm.get(1));
			System.out.println("No of Idly you want");
			int i=s.nextInt();
			System.out.println("One idly Rs."+Price.idlyPrice+" "+"Total: "+Price.idlyPrice(i));
			Order.placeOrder();
			
			
		}else if(n==2) {
			System.out.println(hm.get(2));
			System.out.println("No of dosa you want");
			int i=s.nextInt();
			System.out.println("One dosa Rs."+Price.dosaPrice+" "+"Total: "+Price.dosaPrice(i));
			Order.placeOrder();
			
			
		}else if(n==3) {
			System.out.println(hm.get(3));
			System.out.println("No of pori you want");
			int i=s.nextInt();
			System.out.println("One pori Rs."+Price.poriPrice+" "+"Total: "+Price.poriPrice(i));
			Order.placeOrder();
			
			
		}else if(n==4) {
			System.out.println(hm.get(4));
			System.out.println("No of pongal you want");
			int i=s.nextInt();
			System.out.println("One Pongal Rs."+Price.pongalPrice+" "+"Total: "+Price.pongalPrice(i)); 
			Order.placeOrder();
			
			
		}else {
			System.out.println("please enter correct dish");
			FoodMenu.menu();
		}
		
		}

}
