package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSizeSearchFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>wq=new LinkedList<>();
		wq.add("Jennifer");
		wq.add("Angelina");
		wq.add("Johnny");
		wq.add("Sachin");
		
		System.out.println("Waiting Queue:"+wq);
		System.out.println("waiting queue is empty:"+wq.isEmpty());
		System.out.println("size of waiting queue:"+wq.size());
		
		String name="Johnny";
		if(wq.contains(name)) {
			System.out.println("waiting queue contains "+name);
		}else {
			System.out.println("waiting queue doesn't contain"+name);
		}
		String firstPersonInTheWaitingQueue=wq.element();
		System.out.println("first person in the waiting queue:"+firstPersonInTheWaitingQueue);
		
		firstPersonInTheWaitingQueue=wq.peek();
		System.out.println("first person in the waiting queue:"+firstPersonInTheWaitingQueue);

	}

}
