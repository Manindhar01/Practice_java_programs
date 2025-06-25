package com.java.bus_reservation;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class From {
	static String inputdate;
	 
       public void destination() {
    	   Scanner s=new Scanner(System.in);
    	   System.out.println("WELCOME TO REDBUS!");
    	   System.out.println("Online bus Ticket booking");
    	   System.out.print("From: ");
    	   String from=s.next();
    	   System.out.print("To: ");
    	   String to=s.next();
    	   System.out.println("Enter date dd/mm/yyy this format");
    	   inputdate =s.next();
    	   SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    	   try {
			Date date=sdf.parse(inputdate);
			Search.match();
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	   
       }

}
