package com.java.bus_reservation;

public class Search {

	public static void match() {

		if (From.inputdate.equals(SheduleDate.sdate)) {
			SheduleDate.sheDate();
		} else {
			System.out.println("not available");
		}

	}
}
