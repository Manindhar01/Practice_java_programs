package Mutithreading_Example;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority tp=new ThreadPriority();
		tp.setPriority(MIN_PRIORITY);
		tp.setName("hp");
		tp.start();
		
		ThreadPriority tp1=new ThreadPriority();
		tp1.setPriority(MAX_PRIORITY);
		tp1.setName("Dell");
		tp1.start();
		
		

	}
	public void run() {
		System.out.println("Thread name:"+Thread.currentThread().getName());
	}

}
