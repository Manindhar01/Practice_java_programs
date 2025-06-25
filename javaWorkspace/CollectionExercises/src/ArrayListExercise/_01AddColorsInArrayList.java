package ArrayListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class _01AddColorsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> al=new ArrayList<>();
		al.add("red");
		al.add("green");
		al.add("Black");
		al.add("yellow");
		System.out.println(al+"\n");

		System.out.println(al.get(2)+"\n");
		
		al.addFirst("white");
		
		al.set(2, "blue");
		
		al.remove(3);
		
		System.out.println(al.contains("Black"));
		
		Collections.sort(al);
		
		System.out.println();
		
		for(String t:al) {
			System.out.println(t);
		}
		

	}

}
