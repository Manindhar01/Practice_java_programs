package com.numberformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		DateFormat dfUK=DateFormat.getDateInstance(0,Locale.UK);
		DateFormat dfUS=DateFormat.getDateInstance(0,Locale.US);
		
		System.out.println("date in UK formate: "+dfUK.format(d));
		System.out.println("date in US formate:"+dfUS.format(d));
		
		DateFormat timeInstance=DateFormat.getTimeInstance(0);
		System.out.println(timeInstance.format(d));
		
		DateFormat dateTimeInstance=DateFormat.getDateTimeInstance(0, 0);
		System.out.println(dateTimeInstance.format(d));

	}

}
