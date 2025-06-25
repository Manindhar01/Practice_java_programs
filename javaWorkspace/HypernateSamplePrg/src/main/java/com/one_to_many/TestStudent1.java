package com.one_to_many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l1=new Library();
		l1.setBookId(11);
		l1.setBookName("ponniyen selvan");
		l1.setAuthor("kalki");
		
		Library l2=new Library();
		l2.setBookId(12);
		l2.setBookName("Kallikaattu Ithigaasam");
		l2.setAuthor("Vairamuthu");
		
		Library l3=new Library();
		l3.setBookId(13);
		l3.setBookName("Vandhargal Vendrargal");
		l3.setAuthor("Madhan");
		
		Library l4=new Library();
		l4.setBookId(14);
		l4.setBookName("Sila Nerangalil Sila Manithargal");
		l4.setAuthor("Jayakanthan");
		
		ArrayList<Library> al=new ArrayList<Library>();
		al.add(l1);
		al.add(l2);
		
		ArrayList<Library> al1=new ArrayList<Library>();
		al1.add(l3);
		al1.add(l4);
		
		Student1 s=new Student1();
		s.setStdId(1);
		s.setName("Suriya");
		s.setStd(6);
		s.setLibrary(al);
		
		Student1 s1=new Student1();
		s1.setStdId(2);
		s1.setName("Arya");
		s1.setStd(8);
		s1.setLibrary(al1);
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student1.class).addAnnotatedClass(Library.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		session.save(s1);
		
		tx.commit();
		sf.close();
	}

}
