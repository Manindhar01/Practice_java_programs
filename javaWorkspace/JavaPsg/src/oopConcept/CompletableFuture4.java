package oopConcept;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFuture4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CompletableFuture<String> future=CompletableFuture.supplyAsync(new Supplier<String>(){
			
			public String get() {
				try {
					TimeUnit.SECONDS.sleep(1);
				}catch(InterruptedException e) {
					throw new IllegalStateException (e);
				} return "Result of the asynchronous computation";
		}
		});
		String result=future.get();
		System.out.println(result);

	}
}
