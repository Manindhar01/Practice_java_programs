package Mutithreading_Example;

public class MultithreadedExamp extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultithreadedExamp me=new MultithreadedExamp();
		me.start();
		for(int j=1;j<=100;j++) {
			System.out.print("j:"+j+"\t");
			Thread.sleep(1000);
		}
	}
		
		
		public void run() {
			for(int i=1;i<=100;i++) {
				System.out.print("i:"+i+"\t");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Child thread existing");
				}
			}
		

	}

}
