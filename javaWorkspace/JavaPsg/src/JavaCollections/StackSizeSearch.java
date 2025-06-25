package JavaCollections;

import java.util.Stack;

public class StackSizeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> soc=new Stack();
		soc.push("Jack");
		soc.push("queen");
		soc.push("king");
		soc.push("ace");
		
		System.out.println("stack:"+soc);
	    System.out.println("is stack empty? "+soc.isEmpty());
	    System.out.println("size of stack:"+soc.size());
	    
	    int position=soc.search("king");
	    
	    if(position!=-1) {
	    	System.out.println("the queen position is: "+position);
	    }else {
	    	System.out.println("element not found");
	    }

	}

}
