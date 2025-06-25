package ArrayListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _02CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println("First: "+al);
		ArrayList<String> al1=new ArrayList<>();
		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.add("4");
		System.out.println("Second: "+al1);
		
		System.out.println(al.equals(al1));
		
		Collections.copy(al, al1);
		System.out.println("after First: "+al);
		System.out.println("after second: "+al1);
		
		List<String> subList = al1.subList(1,3);
		System.out.println(subList);
		
		Collections.reverse(al1);
		System.out.println(al1);
		
		Collections.shuffle(al1);
		System.out.println(al1);
		
		
		
		

	}

}
