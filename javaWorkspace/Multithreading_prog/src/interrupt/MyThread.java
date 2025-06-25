package interrupt;

public class MyThread extends Thread {
	
	public void run(){
		try {
			for(int i=0;i<5;i++) {
				System.out.println("i am a lazy thread");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Got Interrupted");
		}
	}

}
