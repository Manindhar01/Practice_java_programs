package com.java.online_ticket_booking;

import java.util.Scanner;

public class CheckAdminOrUser{
	
	public  void check() {
		System.out.println("Are you admin or user enter here");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		if(n.equals("admin")) {
			Admin.modify();
			
		}else if(n.equals("user")){
			User.listmovie();
			
		}else {
			System.out.println("invalid input retry");
			check();
		}
		
		
		
		
		
	}

}
