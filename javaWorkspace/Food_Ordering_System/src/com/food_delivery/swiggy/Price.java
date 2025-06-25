package com.food_delivery.swiggy;

public class Price {
	
	static int idlyPrice=5;
	static int dosaPrice=20;
	static int poriPrice=25;
	static int pongalPrice=35;
	public static int idlyPrice(int sum) {
		
		return idlyPrice*sum;	
	}
	public static int dosaPrice(int sum) {
		return dosaPrice*sum;
	}
	public static int poriPrice(int sum) {
		return poriPrice*sum;
		
	}
	public static int pongalPrice(int sum) {
		return pongalPrice*sum;
	}

}
