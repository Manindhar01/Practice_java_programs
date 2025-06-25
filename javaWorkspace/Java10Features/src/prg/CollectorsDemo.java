package prg;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(15, 22, 17, 42);
		List<Integer> newList=list.stream().filter(i->i%3==0).collect(Collectors.toUnmodifiableList());
		System.out.println(newList);

	}

}
