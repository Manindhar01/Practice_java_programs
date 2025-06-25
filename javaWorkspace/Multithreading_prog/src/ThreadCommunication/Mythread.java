package ThreadCommunication;

public class Mythread extends Thread{
	
	int total;
	public void run() {
		System.out.println("child thread calculating the sum:");
		synchronized(this) {
		for(int i=1;i<=10;i++) {
			total=+i;
		}
		this.notify();
	}
	}

}
