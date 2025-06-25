package JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numDivBy5=new ArrayList<>();
		numDivBy5.add(5);
		numDivBy5.add(10);
		numDivBy5.add(15);
		numDivBy5.add(20);
		numDivBy5.add(25);
		
		List<Integer> numDivBy3=new ArrayList<>();
		numDivBy3.add(3);
		numDivBy3.add(6);
		numDivBy3.add(9);
		numDivBy3.add(12);
		numDivBy3.add(15);
		
		Set<Integer> numDivBy5Or3=new HashSet<>(numDivBy5);
		
		numDivBy5Or3.addAll(numDivBy5Or3);
		System.out.println(numDivBy5Or3);

	}

}
