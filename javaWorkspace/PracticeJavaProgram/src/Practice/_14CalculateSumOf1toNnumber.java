package Practice;

import java.util.Scanner;

public class _14CalculateSumOf1toNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Sum Of Number: ");
		int n=s.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
