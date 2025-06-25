package set;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(40);
		ts.add(50);
		
		System.out.println(ts);
		
		System.out.println(ts.ceiling(20));
		System.out.println(ts.higher(40));
		System.out.println(ts.floor(10));
		System.out.println(ts.lower(30));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.descendingSet());
		System.out.println(ts);

	}

}
