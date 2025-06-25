package Practice;

public class _11SumOfDigitUseRecursiveFunc {
	
	public static int sum(int num) {
		if(num==0) {
			return 0;
		}
		return num%10+sum(num/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sum(1234);
		System.out.println("Sum of digit is: "+n);

	}

}
