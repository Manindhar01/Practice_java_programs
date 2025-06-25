package Generics;

import java.util.ArrayList;

public class WildCardParm {
	
	public static void main(String[] args) {
		WildCardParm wcp=new WildCardParm();
		wcp.Mymethod(new ArrayList<A>());
	}
	public void Mymethod(ArrayList<? super B> l) {
		l.add(null);
		l.add(new B());
		
	}

}
