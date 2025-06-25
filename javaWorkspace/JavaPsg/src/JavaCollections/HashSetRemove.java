package JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num=new HashSet<>();
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		System.out.println("numbers:"+num);
		boolean isRemoved=num.remove(10);
		System.out.println(isRemoved);
		System.out.println("after remove 10:"+num);
		
		List<Integer> ps=new ArrayList<>();
		ps.add(4);
		ps.add(9);
		
		num.removeAll(ps);
		System.out.println("after remove all ps:"+num);
		
		num.removeIf(nu->nu%2==0);
		System.out.println("after removeif():"+num);
		
		num.clear();
		System.out.println("after clear:"+num);

	}

}
