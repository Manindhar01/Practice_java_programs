package com.one_to_many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StroeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Answer a1 = new Answer();
		a1.setAnswerName("Java is a Programming language");
		a1.setPostedBy("Hari");
		
		Answer a2=new Answer();
		a2.setAnswerName("Java is platform independent");
		a2.setPostedBy("sanjay");
		
		Answer a3 = new Answer();
		a3.setAnswerName("Hypernate is a orm toll");
		a3.setPostedBy("vinalan");
		
		Answer a4=new Answer();
		a4.setAnswerName("hypernate is used to interact database");
		a4.setPostedBy("gopi");
		
		ArrayList<Answer> al=new ArrayList<Answer>();
		al.add(a1);
		al.add(a2);
		ArrayList<Answer> al1=new ArrayList<>();
		al1.add(a3);
		al1.add(a4);
		
		Question q = new Question();
		q.setQname("what is java?");
		q.setAnswer(al);
		
		Question q1 = new Question();
		q1.setQname("what is hypernate");
		q1.setAnswer(al1);
		
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
