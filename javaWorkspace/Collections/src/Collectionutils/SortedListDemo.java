package Collectionutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al=new ArrayList<>();
		al.add("X");
		al.add("B");
		al.add("D");
		al.add("Z");
		al.add("A");
		System.out.println("before sort:"+al);
		
		Collections.sort(al);
		int result=Collections.binarySearch(al,"Z");
		System.out.println("Index is: "+result);
		
		Collections.sort(al,new MyComperator());
		
		System.out.println("after sort:"+al);

	}

}
