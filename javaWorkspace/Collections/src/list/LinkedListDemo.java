package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object objects[]=new Object[1000000];
		
		for(int i=0;i<objects.length;i++) {
			objects[i]=new Object();
		}
		List<Object> ll=new ArrayList<>();
		long start=System.currentTimeMillis();
		for(Object object:objects) {
			ll.add(object);
		}
		long end=System.currentTimeMillis();
		System.out.println("total time taken:"+(end-start));

	}

}
