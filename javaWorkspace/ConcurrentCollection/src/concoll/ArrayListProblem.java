package concoll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread{
	
	static CopyOnWriteArrayList<String> courses=new CopyOnWriteArrayList<String>();
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		courses.add("Kubernates");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListProblem arraylistproblem=new ArrayListProblem();
		arraylistproblem.start();	
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		
		Iterator<String> iterator=courses.iterator();
		while(iterator.hasNext()) {
			String course=iterator.next();
			System.out.println(course);
			if(course.equals("Docker")) {
				courses.remove(course);
			}
		}
		System.out.println(courses);

	}

}
