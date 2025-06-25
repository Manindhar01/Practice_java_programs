package JavaCollections;

import java.util.LinkedList;

public class RemoveElementFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> pl=new LinkedList<>();
		pl.add("C");
		pl.add("C++");
		pl.add("Java");
		pl.add("c#");
		pl.add("Kotlin");
		pl.add("python");
		System.out.println("initial linked list:"+pl);
		String element=pl.removeFirst();
		System.out.println("Removed first element:"+element+"=>"+pl);
		element=pl.removeLast();
		System.out.println("Removed last element:"+element+"=>"+pl);
		boolean isRemoved=pl.remove("c#");
		if(isRemoved) {
			System.out.println("Removed c#=>"+pl);
		}
		pl.removeIf(p->p.startsWith("C"));
		System.out.println("removed element start with c=>"+pl);
		
		pl.clear();
		System.out.println("cleared the LinkedList=>"+pl);
		
		
	
		

	}

}
