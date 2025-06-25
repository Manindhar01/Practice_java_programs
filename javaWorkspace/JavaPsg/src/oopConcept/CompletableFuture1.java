package oopConcept;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CompletableFuture<String> cf=new CompletableFuture<String>();	
		cf.complete("Future's result");
		String result=cf.get();
		System.out.println(result);

	}

}
