package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPrg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("hari");
		ll.add("sanjay");
		ll.add("mani");
		ll.add("sakthi");
		System.out.println(ll);
		ll.add(2,"vickey");
		System.out.println("after added vickey:"+ll);
		ll.addFirst("hema");
		System.out.println("after add first:"+ll);
		ll.addLast("kiran");
		System.out.println("after add last:"+ll);
		
		List<String> ff=new ArrayList<>();
		ff.add("vijay");
		ff.add("ajith");
		
		ll.addAll(ff);
		System.out.println("aftrer all added:"+ll);

	}

}
