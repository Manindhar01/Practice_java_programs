package Collectionutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(12);
		al.add(9);
		al.add(45);
		al.add(23);
		System.out.println("before reverse:"+al);
		Collections.reverse(al);
		System.out.println("after reverse:"+al);

	}

}
