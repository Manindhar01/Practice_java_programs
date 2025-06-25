package sample;

import java.util.Scanner;

public class ChooseOne {

	ChooseOne() {
		Scanner s=new Scanner(System.in);
		System.out.println("Withdraw enter----------> 1");
		System.out.println("balance enquiry enter---> 2");
		System.out.println("Change pin Number enter-> 3");
		int n=s.nextInt();
		if(n==1) {
			
			new Withdraw();
			
		}else if(n==2) {
			new BalanceEnquiry();
				
		}else if(n==3) {
			new ChangePin();
			
		}else {
			System.out.println("try again you enter wrong number");
			new ChooseOne();
		}

	}

}
