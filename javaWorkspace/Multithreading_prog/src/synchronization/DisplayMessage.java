package synchronization;

public class DisplayMessage {
	public synchronized void sayHello(String name) {
		for(int i=0;i<5;i++) {
			System.out.println("How are you "+name);
		}
	}

}
