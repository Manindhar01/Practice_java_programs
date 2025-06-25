package com.table_per_subclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo si = new StudentInfo();
		si.setId(1);
		si.setName("sanjay");
		
		BusInfo bi = new BusInfo();
		bi.setId(2);
		bi.setBusNO(201);
		bi.setBusFrom("Thanjavur");
		bi.setBusTo("Trichy");
		
		CourseInfo ci = new CourseInfo();
		ci.setId(3);
		ci.setCourseName("BCA");
		ci.setDuration("3 Years");
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(StudentInfo.class).addAnnotatedClass(BusInfo.class).addAnnotatedClass(CourseInfo.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(si);
		session.save(bi);
		session.save(ci);
		
		tx.commit();
		sf.close();

	}

}
