package arraysutil;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {54,23,64,15,10,17};
		System.out.println("before sorting:");
		for(int i:a) {
			System.out.println(i);
		}
		
		System.out.println("after sorting:");
		Arrays.sort(a);
		for(int i:a) {
			System.out.println(i);
		}
		
		String s[]= {"X","D","A","Z","F"};
		System.out.println("Sort a String:");
		Arrays.sort(s);
		for(String strele:s) {
			System.out.println(strele);
		}
		
		System.out.println("Reverse using comperator:");
		Arrays.sort(s,new MyComperator());
		for(String strele:s) {
			System.out.println(strele);
		}
		
		List<String> list=Arrays.asList(s);
		s[1]="Y";
		System.out.println("it converted array to list:"+list);
	
		

	}

}
