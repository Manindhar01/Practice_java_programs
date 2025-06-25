package sample;

public class ArrayIndexOutOFBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30};
		try {
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index array beyond lenght");
		}
		  System.out.println("after array output");
		}
	void method1() {
		System.out.println("method 1");
	    

	}

}
