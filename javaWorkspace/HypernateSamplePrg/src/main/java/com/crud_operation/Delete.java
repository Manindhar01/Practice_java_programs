package com.crud_operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student s = session.get(Student.class,3);
		session.delete(s);
		tx.commit();
		sf.close();

	}

}
