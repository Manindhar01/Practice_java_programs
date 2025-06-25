package com.mapping_list;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Java is a programming language");
		al1.add("java is platform independent");
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Hibernate is a orm tool");
		al2.add("Hibernate is used to interact with database");
		
		Question q=new Question();
		q.setId(1);
		q.setQuestion("What is Java?");
		q.setAnswer(al1);
		
		Question q1 = new Question();
		q1.setId(2);
		q1.setQuestion("What is Hypernate?");
		q1.setAnswer(al2);
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Question.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q);
		session.save(q1);
		
		tx.commit();
		sf.close();
		System.out.println("success");
	}

}
