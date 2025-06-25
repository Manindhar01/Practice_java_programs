package JavaCollections;

import java.util.LinkedList;

public class SearchLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> employee=new LinkedList<>();
		employee.add("hari");
		employee.add("hema");
		employee.add("mani");
		employee.add("sakthi");
		employee.add("vickey");
		System.out.println("employee list contain sakthi:"+employee.contains("sakthi"));
		System.out.println(employee.indexOf("hema"));
		System.out.println(employee.indexOf("mani"));
		System.out.println(employee.lastIndexOf("vickey"));
		System.out.println(employee.lastIndexOf("kiren"));

	}

}
