package oopConcept;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

	public static void main(String[] args)throws InterruptedException,ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newSingleThreadExecutor();
		Future<String> future=es.submit(()->{
			Thread.sleep(2000);
			return "welcome to java";
		});
		while(!future.isDone()) {
			System.out.println("the task still processing...");
			Thread.sleep(200);
		}
		System.out.println("Task completed getting the result");
		String result=future.get();
		System.out.println(result);
		es.shutdown();

	}

}
