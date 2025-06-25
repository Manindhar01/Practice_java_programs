package IOprg;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hi-every-one,how,are,you";
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
