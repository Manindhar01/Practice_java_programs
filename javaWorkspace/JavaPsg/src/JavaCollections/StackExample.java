package JavaCollections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> soc=new Stack<>();
		soc.push("Jack");
		soc.push("queen");
		soc.push("ace");
		soc.push("king");
		System.out.println("stack =>"+soc);
		System.out.println();
		
		String cardAtTop=soc.pop();
		System.out.println(cardAtTop);
		System.out.println(soc);
		System.out.println();
		
		cardAtTop=soc.peek();
		System.out.println(cardAtTop);
		System.out.println(soc);

	}

}
