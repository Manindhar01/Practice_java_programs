package JavaCollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> fruit=new TreeSet<>();
		fruit.add("mango");
		fruit.add("apple");
		fruit.add("pineapple");
		fruit.add("orange");
		System.out.println("fruit set:"+fruit);
		fruit.add("apple");
		System.out.println("after added dublicate:"+fruit);
		fruit.add("banana");
		System.out.println("after adding banana:"+fruit);

	}

}
