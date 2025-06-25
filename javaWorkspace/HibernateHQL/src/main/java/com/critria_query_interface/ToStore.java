package com.critria_query_interface;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ToStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		sf.close();

	}

}
