package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new LinkedList<>();
		list.add("abc");
		list.add("def");
		list.add("xyz");
		
		ListIterator<String> lt=list.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println();
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
