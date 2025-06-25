package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class DifferentSets {
	public static void main(String args) {
		Random obj1 =new Random();
		
		//HashSet<Integer> st=new HashSet<>();
		LinkedHashSet<Integer> st=new LinkedHashSet<>();
		
		for(int i=0;i<=5;i++) {
			int num=obj1.nextInt(100);
			st.add(num);
			System.out.println(num);
		}
		System.out.println("Hash Set elements:"+st);
	}

}
