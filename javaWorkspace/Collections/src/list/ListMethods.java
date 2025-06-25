package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<>();
		for(int i=10;i<=100;i=i+10) {
			al.add(i);
		}
		System.out.println("list"+al);
		
		al.add(2,150);
		System.out.println("After add:"+al);
		
		al.set(4, 50);
		System.out.println("After replace:"+al);
		
		List<Integer> secondlist=new ArrayList<>();
		secondlist.add(101);
		secondlist.add(202);
		secondlist.add(303);
		System.out.println("secondlist:"+secondlist);
		
		al.addAll(5,secondlist);
		System.out.println("First list:"+al);
		
		if(al.contains(50)) {
			System.out.println("list has the value");
		}else {
			System.out.println("list not have the value");
		}
		
		System.out.println("Elements in the list are:");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		al.remove(4);
		System.out.println("after deletion:"+al);

	}

}
