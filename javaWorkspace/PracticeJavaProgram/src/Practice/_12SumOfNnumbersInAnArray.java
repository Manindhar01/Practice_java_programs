package Practice;

public class _12SumOfNnumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,3,5,2,6};
		int sum=0;
		int size=n.length;
		for(int i=0;i<size;i++) {
			sum=sum+n[i];
		}
		System.out.println(sum);

	}

}
