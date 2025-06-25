package concoll;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread {
	
	static CopyOnWriteArraySet<String> courses=new CopyOnWriteArraySet<String>();
	
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
		
		ArraySetProblem arraysetproblem=new ArraySetProblem();
		arraysetproblem.start();	
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		
		Iterator<String> iterator=courses.iterator();
		while(iterator.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String course=iterator.next();
			System.out.println(course);
			if(course.equals("Docker")) {
				courses.remove(course);
			}
		}
		System.out.println(courses);

	}

}
