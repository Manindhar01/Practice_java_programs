package com.numberformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		String s=sdf.format(new Date());
		System.out.println(s);
		
		String dateAsString="09-27-2001";
		SimpleDateFormat sdf2=new SimpleDateFormat("M-dd-yyyy");
		//Date a=sdf2.parse(dateAsString);
	//	System.out.println(a);
		
		

	}

}
