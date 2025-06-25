package oopConcept;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

class sample{
	
}

public class CompletableFuture3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CompletableFuture<Void> future=CompletableFuture.runAsync(()->{
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e) {
				throw new IllegalStateException(e);
			}
			System.out.println("i will run in seperate thread than main thread");
		});
		
		future.get();

	}

}
