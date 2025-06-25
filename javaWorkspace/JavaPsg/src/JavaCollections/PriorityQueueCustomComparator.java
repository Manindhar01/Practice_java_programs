package JavaCollections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> slc=new Comparator<String>() {
			public int compare(String s1,String s2) {
				return s1.length()-s2.length();
			}
		};
		PriorityQueue<String> nPQ=new PriorityQueue<>(slc);
		nPQ.add("Lisa");
		nPQ.add("Robert");
		nPQ.add("John");
		nPQ.add("Chris");
		nPQ.add("Angelina");
		nPQ.add("Joe");
		
		while(!nPQ.isEmpty()) {
			System.out.println(nPQ.remove());
		}

	}

}
