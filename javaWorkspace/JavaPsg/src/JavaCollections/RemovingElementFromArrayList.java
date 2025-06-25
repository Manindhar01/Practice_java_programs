package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemovingElementFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> pl=new ArrayList<>();
		pl.add("c");
		pl.add("c++");
		pl.add("java");
		pl.add("kotlin");
		pl.add("python");
		pl.add("ruby");
		System.out.println("initial List:"+pl);
		pl.remove(5);
		System.out.println("After remove 5:"+pl);
		boolean isRemoved=pl.remove("python");
		System.out.println("After remove:"+pl);
		System.out.println(isRemoved);
		
		List<String> sl=new ArrayList<>();
		sl.add("Python");
		sl.add("Ruby");
		sl.add("perl");
		
		pl.removeAll(sl);
		System.out.println("After remove all:"+pl);
		
		pl.removeIf(new Predicate<String>(){
			public boolean test(String s) {
				return s.startsWith("C");
			}
		});
		System.out.println("after removing all elements"+pl);
		pl.clear();
		System.out.println("after clear():"+pl);
		

	}

}
