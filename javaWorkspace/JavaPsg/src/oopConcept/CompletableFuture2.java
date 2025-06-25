package oopConcept;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuture2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CompletableFuture<Void> future=CompletableFuture.runAsync(new Runnable() {
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(4);
				}catch(InterruptedException e) {
					throw new IllegalStateException(e);
				}
				System.out.println("i will run in a seperate thread than main thread");
			}
		});
		future.get();

	}

}
