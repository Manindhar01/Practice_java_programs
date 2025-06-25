package JavaCollections;

import java.util.HashSet;
import java.util.Set;

public class HashSetSimpleOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> pc=new HashSet<>();
		System.out.println("is popular city empty:"+pc.isEmpty());
		
		pc.add("dubai");
		pc.add("new yourk");
		pc.add("paris");
		pc.add("london");
		System.out.println("number of popular city are:"+pc);
		String cityName="paris";
		if(pc.contains(cityName)) {
			System.out.println(cityName+" is in popular city");
		}else {
			System.out.println(cityName+"is not in popular city");
		}

	}

}
