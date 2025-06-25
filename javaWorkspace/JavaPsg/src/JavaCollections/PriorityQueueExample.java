package JavaCollections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> num=new PriorityQueue<>();
		num.add(800);
		num.add(750);
		num.add(300);
		num.add(600);
		num.add(100);
		
		while(!num.isEmpty()) {
			System.out.println(num.remove());
		}
		System.out.println(num.isEmpty());

	}

}
