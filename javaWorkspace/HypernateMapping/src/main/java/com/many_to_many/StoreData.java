package com.many_to_many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	public static void main(String[] args) {
		
		Answer a = new Answer();
		a.setAnswerName("java is aprogramming language");
		a.setPostedBy("Sanjay");
		
		Answer a1 = new Answer();
		a1.setAnswerName("java is platform indepentant");
		a1.setPostedBy("hari");
		
		Question q=new Question();
		q.setQname("What is java");
		ArrayList<Answer> al=new ArrayList<>();
		al.add(a);
		al.add(a1);
		
		Answer a3 = new Answer();
		a3.setAnswerName("hypernate is a orm tool");
		a3.setPostedBy("Sakthi");
		
		Answer a4 = new Answer();
		a4.setAnswerName("hypernate is used to interact database");
		a4.setPostedBy("vinalan");
		
		Question q1=new Question();
		q.setQname("What is Hypernate");
		ArrayList<Answer> al1=new ArrayList<>();
		al1.add(a3);
		al1.add(a4);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q);
		session.save(q1);
		
		tx.commit();
		sf.close();
	}

}
