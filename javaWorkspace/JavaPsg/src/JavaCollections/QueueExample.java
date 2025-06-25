package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> wq=new LinkedList<>();
		wq.add("hari");
		wq.add("sakthi");
		wq.add("sanjay");
		wq.add("mani");
		wq.add("hema");
		
		System.out.println("waitingQueue:"+wq);
		
		String name=wq.remove();
		System.out.println("remove waiting queue:"+name+"new waiting queue"+wq);
		name=wq.poll();
		System.out.println("removed waiting queue"+name+"new waiting queue");

	}

}
