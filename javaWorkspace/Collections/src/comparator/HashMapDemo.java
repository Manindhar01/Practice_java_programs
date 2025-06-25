package comparator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hm=new HashMap<>();
		hm.put("sakthi",66);
		hm.put("sanjay",70 );
		hm.put("hari", 50);
		hm.put("gopi",90);
		
		Set<String> keySet=hm.keySet();
		System.out.println("key value: "+keySet);
		
		Collection<Integer> values=hm.values();
		System.out.println("values: "+values);
		
		for(String key:keySet) {
			System.out.println("key: "+key+" value :"+hm.get(key));
		}

	}

}
