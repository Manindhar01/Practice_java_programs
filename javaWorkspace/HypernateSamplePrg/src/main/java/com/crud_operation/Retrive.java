package com.crud_operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Student s = session.get(Student.class,1);
		System.out.println("Id: "+s.getId());
		System.out.println("Name: "+s.getName());
		System.out.println("standard: "+s.getStd());
		
		System.out.println("Fetching object using get:");
		Student s1 = session.get(Student.class, 3);
		System.out.println(s1);
		System.out.println("fetching object using load:");
		Student s2=session.load(Student.class, 3);
		System.out.println(s2);
		
		sf.close();

	}

}
