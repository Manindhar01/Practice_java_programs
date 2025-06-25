package JavaCollections;

import java.util.PriorityQueue;

public class PriorityQueueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> namePQ=new PriorityQueue<>();
		namePQ.add("vijay");
		namePQ.add("suriya");
		namePQ.add("karthi");
		namePQ.add("ajith");
		
		while(!namePQ.isEmpty()) {
			System.out.println(namePQ.remove());
		}
		System.out.println(namePQ.isEmpty());

	}

}
