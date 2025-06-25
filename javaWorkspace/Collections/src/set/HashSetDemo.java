package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj=new Random();
		List<Integer> al=new ArrayList<>();
			for(int i=1;i<=10;i++) {
				int num=obj.nextInt(5);
				al.add(num);
			}
			System.out.println("list: "+al);
			
			Set<Integer> set=new HashSet<>(al);
			System.out.println("Set: "+set);

	}

}
