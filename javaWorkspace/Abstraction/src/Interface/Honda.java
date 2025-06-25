package Interface;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside honda go");
	}

	@Override
	public void Stop() {
		System.out.println("Inside honda stop");
	}

}
