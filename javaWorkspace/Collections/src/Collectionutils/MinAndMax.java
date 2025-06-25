package Collectionutils;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {10,-4,-3,20,45,30,2};
		Integer min=Collections.min(Arrays.asList(a));
		Integer max=Collections.max(Arrays.asList(a));
		System.out.println("minimum value of array is:"+min);
		System.out.println("maximum value of array is:"+max);
		

	}

}
