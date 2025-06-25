package JavaCollections;

import java.util.HashSet;
import java.util.Set;

class CreateHarshSet {

	public static void main(String[] args) {
		Set<String> daysOfWeek=new HashSet<>();
		daysOfWeek.add("monday");
		daysOfWeek.add("tuesday");
		daysOfWeek.add("wednesday");
		daysOfWeek.add("thursday");
		daysOfWeek.add("friday");
		daysOfWeek.add("saturday");
		daysOfWeek.add("sunday");
		
		daysOfWeek.add("monday");
		
		System.out.println(daysOfWeek);
		

	}

}
