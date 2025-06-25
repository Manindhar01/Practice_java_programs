package oopConcept;

import java.util.Stack;

public class DeciToBinaUseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0;
		int n=8;
		int r;
		Stack stk=new Stack();
		while(n!=0) {
			r=n%2;
			stk.push(r);
			n=n/2;
		}
		System.out.print("binary:");
		while(!(stk.isEmpty())) {
			System.out.print(stk.pop());
		}

	}

}
