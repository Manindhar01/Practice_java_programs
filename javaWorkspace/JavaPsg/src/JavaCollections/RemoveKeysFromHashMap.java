package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeysFromHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> husbandWifeMap=new HashMap<>();
		husbandWifeMap.put("Jack", "Maria");
		husbandWifeMap.put("Chris","Lisa");
		husbandWifeMap.put("Steve","Jennifer");
		
		System.out.println("Husband wife mapping:"+husbandWifeMap);
		String husband="Chris";
		String wife=husbandWifeMap.remove(husband);
		System.out.println("Couple("+husband+"=>"+wife+")got divorced");
		System.out.println("new mapping:"+husbandWifeMap);
		
		boolean isRemoved=husbandWifeMap.remove("jack", "linda");
		System.out.println("did jack get removed from map:"+isRemoved);

	}

}
