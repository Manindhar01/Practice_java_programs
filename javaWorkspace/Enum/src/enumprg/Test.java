package enumprg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentType pt=PaymentType.DEBITCARD;
		//System.out.println(pt);
		
		PaymentType[] payment=PaymentType.values();
		for(PaymentType pay:payment) {
		System.out.println(pay);
		}
		
		System.out.println(pt.getFee());
		

		
		

	}

}
