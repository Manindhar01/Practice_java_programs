package sample;

public class NumformatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s="abcd";
		int n=Integer.parseInt(s);
		System.out.println(n);

		}catch(NumberFormatException e) {
			System.out.println("you give a invalid string to convert");
		}
	
	}

}
