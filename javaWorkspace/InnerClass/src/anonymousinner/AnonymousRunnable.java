package anonymousinner;

public class AnonymousRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("anonymous runnable implements");
				
			}
			
		});
		t.start();

	}

}
