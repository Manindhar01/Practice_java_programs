package com.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=137448734.98483;
		NumberFormat nf=NumberFormat.getInstance();
		
		nf.setMaximumFractionDigits(4);

		System.out.println(nf.format(d));

	}

}
