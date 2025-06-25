package Mutithreading_Example;

import java.util.Scanner;

public class JoinMethod extends Thread{
	
	static int n,sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		System.out.println("sum of first N number");
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		JoinMethod.n=s.nextInt();
		JoinMethod jm=new JoinMethod();
		jm.start();
		try {
			jm.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sum of "+JoinMethod.n+" is: "+JoinMethod.sum);
		long end=System.currentTimeMillis();
		System.out.println(start);
		System.out.println(end);
		System.out.println("the total time taken is: "+(end-start)/1000+" seconds");
		
		

	}
	public void run() {
		for(int i=1;i<=JoinMethod.n;i++) {
			JoinMethod.sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
