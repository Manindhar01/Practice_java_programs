package sample;

import java.util.Scanner;

public class Withdraw extends CustomerDetails {
	
	Withdraw(){
		System.out.println("Enter withdraw Amount");
		Scanner s=new Scanner(System.in);
		double d=s.nextDouble();
		System.out.println("Enter PinNumber");
		int i=s.nextInt();
		if(i==pinNumber) {
		}else {
			System.out.println("you enter wrong number");
		}
		if(d<=balance) {
			System.out.println("your withdraw ammount: "+d);
			System.out.println(balance-d+" here your current balance");
		}else {
			System.out.println("insufficient balance");
		}
		
		}
	

}
