package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class createArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals=new ArrayList<>();
		animals.add("lion");
		animals.add("tiger");
		animals.add("dog");
		animals.add("cat");
		System.out.println(animals);
		animals.add(2,"elephant");
		System.out.println(animals);

	}

}
