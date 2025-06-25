package JavaCollections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IterateOverStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> sop=new Stack<>();
		sop.push("plate 1");
		sop.push("plate 2");
		sop.push("plate 3");
		sop.push("plate 4");
		System.out.println("iterate stack using for each");
		
		sop.forEach(plate->{
			System.out.println(plate);
		});
		
		System.out.println("iterate using iterator");
		
		Iterator<String> plateIterator=sop.iterator();
		while(plateIterator.hasNext()) {
			System.out.println(plateIterator.next());
		}
		System.out.println("iterate using iterator foreach remaining");
		plateIterator=sop.iterator();
		plateIterator.forEachRemaining(plate->{
			System.out.println(plate);
		});
		
		System.out.println("iterate over stack from top to bottom using listIterator");
		
		ListIterator<String>pli=sop.listIterator(sop.size());
		
		while(pli.hasPrevious()) {
			System.out.println(pli.previous());
		}
		

	}

}
