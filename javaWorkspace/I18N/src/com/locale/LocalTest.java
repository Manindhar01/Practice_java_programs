package com.locale;

import java.util.Locale;

public class LocalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale l=Locale.getDefault();
		System.out.println(l);
		System.out.println(l.getCountry()+" "+l.getLanguage());
		System.out.println(l.getDisplayCountry()+" "+l.getDisplayLanguage());
		
		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault());
		
		String[] ioscountry=Locale.getISOCountries();
		for(String s:ioscountry) {
			System.out.print("\t"+s);
		}
		System.out.println();
		
		String[] ioslanguage=Locale.getISOLanguages();
		for(String s:ioslanguage) {
			System.out.print("\t"+s);
		}

	}

}
