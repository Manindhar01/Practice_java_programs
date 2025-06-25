package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop lap=new Laptop();
		lap.setLapId(100);
		lap.setLapName("Dell");
		
		Laptop lap1=new Laptop();
		lap1.setLapId(101);
		lap1.setLapName("Lenovo");
		
		StudentInfo s=new StudentInfo();
		s.setStudentId(11);
		s.setRollNumber("24BCA001");
		s.setName("Manindhar");
		s.setStudLap(lap);
		
		StudentInfo s1=new StudentInfo();
		s1.setStudentId(12);
		s1.setRollNumber("24BCA002");
		s1.setName("ilyas");
		s1.setStudLap(lap);
		StudentInfo s2=new StudentInfo();
		s2.setStudentId(13);
		s2.setRollNumber("24BCA003");
		s2.setName("suhail");
		s2.setStudLap(lap1);
		
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(StudentInfo.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		StudentInfo std1= (StudentInfo)session.get(StudentInfo.class,11);
		System.out.println(std1);
		tx.commit();
		
		Session session1=sf.openSession();
		Transaction tx1=session1.beginTransaction();
		StudentInfo std2= (StudentInfo)session1.get(StudentInfo.class,11);
		System.out.println(std2);
		tx1.commit();
		//session.save(lap);
		//session.save(lap1);
		//session.save(s);
		//session.save(s1);
		//session.save(s2);
		
		

	}

}
