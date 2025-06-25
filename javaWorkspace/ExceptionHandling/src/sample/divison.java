package sample;

import java.util.Scanner;

public class divison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		try {
		System.out.println("Enter two number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println("Result:"+c);
		}catch(ArithmeticException e) {
			System.out.println("please do not enter 0");
		}
		System.out.println("mor code can go here");

	}

}
