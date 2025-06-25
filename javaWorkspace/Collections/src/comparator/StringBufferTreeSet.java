package comparator;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<StringBuffer> ts=new TreeSet<>();
		
		ts.add(new StringBuffer("xyz"));
		ts.add(new StringBuffer("def"));
		ts.add(new StringBuffer("ghi"));
		ts.add(new StringBuffer("abc"));
		
		for(StringBuffer obj:ts) {
			System.out.println(obj);
		}

	}

}
