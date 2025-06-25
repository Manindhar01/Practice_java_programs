package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterateOverQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> wq=new LinkedList<>();
		wq.add("hari");
		wq.add("sanjay");
		wq.add("hema");
		wq.add("mani");
		System.out.println("iterate queue using foreach");
		wq.forEach(name->{
			System.out.println(name);
		});
		System.out.println("iterate the queue using iterative");
		Iterator<String> iwq=wq.iterator();
		while(iwq.hasNext()){
			System.out.println(iwq.next());
		}
		
		System.out.println("iterate oer the queue using iterator and forEachRemaining");
		iwq=wq.iterator();
		iwq.forEachRemaining(name->{
			System.out.println(name);
		});
		
		System.out.println("iterator over queue using for each");
		
		for(String name: wq) {
			System.out.println(name);
		}

	}

}
