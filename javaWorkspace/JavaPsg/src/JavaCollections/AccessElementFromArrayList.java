package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> topCompanies=new ArrayList<>();
		System.out.println("is the topCompanies list empty?:"+topCompanies.isEmpty());
		topCompanies.add("Google");
		topCompanies.add("biznessForce");
		topCompanies.add("Apple");
		topCompanies.add("Micreosoft");
		topCompanies.add("Amazon");
		topCompanies.add("facebook");
		System.out.println("the num of top companies are:"+topCompanies.size());
		System.out.println(topCompanies);
		
		String bestCompany=topCompanies.get(1);
		String secondBestCompany=topCompanies.get(0);
		String lastBestCompany=topCompanies.get(topCompanies.size()-1);
		System.out.println("Best Company:"+bestCompany);
		System.out.println("Second Best Company:"+secondBestCompany);
		System.out.println("last company in the list:"+lastBestCompany);
		
		topCompanies.set(4,"Wallmart");
		System.out.println("Modified top companies list:"+topCompanies);

	}

}
