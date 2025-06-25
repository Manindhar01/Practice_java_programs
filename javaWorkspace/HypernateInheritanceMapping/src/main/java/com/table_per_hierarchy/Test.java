package com.table_per_hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamIndia ti=new TeamIndia();
		ti.setId(1);
		ti.setFirstName("virat");
		ti.setLastName("kohli");
		
		BatsMan bm=new BatsMan();
		bm.setId(2);
		bm.setFirstName("Rohit");
		bm.setLastName("Sharma");
		bm.setBattingHand("Right");
		bm.setHighestScore(156);
		
		Bowler b=new Bowler();
		b.setId(3);
		b.setFirstName("Dhoni");
		b.setBowlingHand("Left");
		b.setBestFigure("5/42");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(TeamIndia.class).addAnnotatedClass(Bowler.class).addAnnotatedClass(BatsMan.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(ti);
		session.save(bm);
		session.save(b);
		tx.commit();
		sf.close();
		

	}

}
