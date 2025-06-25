package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> numMap=new HashMap<>();
		numMap.put("One", 1);
		numMap.put("Two", 2);
		numMap.put("three", 3);
		numMap.putIfAbsent("Four", 4);
		System.out.println(numMap);

	}

}
