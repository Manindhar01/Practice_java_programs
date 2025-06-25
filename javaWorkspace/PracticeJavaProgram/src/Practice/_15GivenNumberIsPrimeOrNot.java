package Practice;

import java.util.Scanner;

public class _15GivenNumberIsPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int c=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c>0) {
			System.out.println("Given Number is not a prime");
		}else {
			System.out.println("Given Number is Prime");
		}
		
		
	}

}
