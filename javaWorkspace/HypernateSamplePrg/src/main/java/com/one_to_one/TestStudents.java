package com.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusRoute br=new BusRoute();
		br.setBusNo(113);
		br.setBusRoute("Kovai");
		
		Students s=new Students();
		//s.setStdId(2);
		s.setName("Dhanush");
		s.setBusId(br);
		
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(BusRoute.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(br);
		session.save(s);
		tx.commit();
		sf.close();

	}

}
