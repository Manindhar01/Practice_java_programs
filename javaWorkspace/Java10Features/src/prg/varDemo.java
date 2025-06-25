package prg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class varDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var x=10;
		
		var y="hi";
		
		var map=new HashMap<String,List<String>>();
		
		for(var entry:map.entrySet()) {
			var value=entry.getValue();
		}
		Consumer<Integer> l=(i)->{
			var z=10;
			System.out.println(i);
		};
		
		var list=new ArrayList<>();
		list.add(123);
		list.add("xyz");
		System.out.println(list);

	}

}
