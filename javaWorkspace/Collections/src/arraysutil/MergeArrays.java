package arraysutil;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1[]= {"A","B","C","D"};
		String a2[]= {"E","F","G","H"};
		ArrayList<String> al=new ArrayList<>(Arrays.asList(a1));
		al.addAll(Arrays.asList(a2));
		System.out.println("Array converted Arraylist to merged:"+al);
		
		Object[] ob=al.toArray();
		System.out.println("Arraylist converted Array:"+Arrays.toString(ob));
		
		

	}

}
