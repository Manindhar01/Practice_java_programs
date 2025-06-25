package Practice;

public class _10SumOfDigOfEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14563;
		int odd=0;
		int even=0;
		while(n!=0) {
		int last=n%10;
		if(last%2==0) {
			even=even+last;
			
		}else {
			odd=odd+last;
		}
		n=n/10;
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
