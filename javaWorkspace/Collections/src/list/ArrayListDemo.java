package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		Iterator<Integer> itr=al.iterator();
		
		while(itr.hasNext()) {
		System.out.println(itr.next());
		itr.remove();
	}
	System.out.println(al);

}
}
