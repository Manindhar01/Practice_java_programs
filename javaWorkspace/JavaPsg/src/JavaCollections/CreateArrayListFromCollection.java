package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> firstFivePrimeN=new ArrayList<>();
		firstFivePrimeN.add(2);
		firstFivePrimeN.add(3);
		firstFivePrimeN.add(5);
		firstFivePrimeN.add(7);
		firstFivePrimeN.add(11);
		
		List<Integer> firstTenPrimeN=new ArrayList<>(firstFivePrimeN);
		
		List<Integer> nextFivePrimeN=new ArrayList<>();
		nextFivePrimeN.add(13);
		nextFivePrimeN.add(17);
		nextFivePrimeN.add(19);
		nextFivePrimeN.add(23);
		nextFivePrimeN.add(29);
		
		firstTenPrimeN.addAll(nextFivePrimeN);
		System.out.println(firstTenPrimeN);
		

	}

}
