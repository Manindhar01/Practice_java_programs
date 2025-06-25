package Practice;

public class _16Print100PrimeNoAndAver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,a=0;
		float avg;
		for(int i=2;i<100;i++) {
			boolean b=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					b=false;
					break;
				}
				}
			if(b==true) {
				System.out.print(i+" ");
				sum=sum+i;
				a++;
			
			}
		}
		System.out.println("\nSum of 100 prime Number is: "+sum);
		avg=sum/a;
		System.out.println("Average value of prime: "+avg);

	}

}
