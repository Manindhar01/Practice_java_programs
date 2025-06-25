package JavaCollections;

import java.util.LinkedList;

public class RetriveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Double> sp=new LinkedList<>();
		sp.add(23.40);
		sp.add(55.00);
		sp.add(22.00);
		sp.add(40.56);
		sp.add(33.98);
		double firstElement=sp.getFirst();
		System.out.println("initial sp:"+firstElement);
		double lastElement=sp.getLast();
		System.out.println("current stock:"+lastElement);
		double spOn3rdDay=sp.get(2);
		System.out.println("sp on third day:"+spOn3rdDay);
	}

}
