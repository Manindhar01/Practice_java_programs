package customException;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {
		// TODO Auto-generated method stub
		//throw new UncheckedCustomException("Bussiness exception occured");
		throw new CheckedCustomException("business exception that need to be handled");

	}

}
