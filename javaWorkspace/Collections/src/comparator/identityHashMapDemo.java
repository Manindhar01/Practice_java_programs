package comparator;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> im=new IdentityHashMap<>();
		Integer id1=new Integer(10);
		Integer id2=new Integer(10);
		
		im.put(id1, "hari");
		im.put(id2, "hema");
		
		System.out.println(im);
		

	}

}
