package sample;

import java.util.Scanner;

public class VerifyAccount extends CustomerDetails{
	VerifyAccount() {
		System.out.println("Enter Your Account Number");
		Scanner s=new Scanner(System.in);
		String n=s.next();
		
		
		
		if(n.equals(AccountNo)){
			
			System.out.println("Welcome to SBI ATM");
			new ChooseOne();
			
		}
		else {
			System.out.println("you enter wrong account number try again\n");
			new VerifyAccount();
		}
		
	}

}
