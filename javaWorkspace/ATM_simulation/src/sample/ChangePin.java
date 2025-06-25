package sample;

import java.util.Scanner;

public class ChangePin extends CustomerDetails {
	ChangePin(){
		System.out.println("Enter your old pin");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if(i==pinNumber) {
			System.out.println("Enter your new pin");
			int j=s.nextInt();
			System.out.println("your new pin is "+j);
		}else {
			System.out.println("you enter wrong pin");
		}
	}

}
