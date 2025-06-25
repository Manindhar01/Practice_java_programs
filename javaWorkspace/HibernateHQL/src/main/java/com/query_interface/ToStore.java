package com.query_interface;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.sql.internal.SQLQueryParser;
import org.hibernate.query.sqm.tree.SqmQuery;

import jakarta.persistence.TypedQuery;

public class ToStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query q=session.createQuery("select rollNum,name from Student where mark=80 ");
		List<Object[]> result = (List<Object[]>) q.list();
		for(Object[] l: result) {
			System.out.println(l[0]+":"+l[1]);
		}
		
		
		
		/*//Get All Records
		Query q=session.createQuery("from Student");
		
		List<Student> student = q.list();
		for(Student s:student) {
			System.out.print(s.getRollNum());
			System.out.print(s.getName());
			System.out.print(s.getMark());
			System.out.println();
		}*/
		
		/*//get records with pagination
		Query q=session.createQuery("from Student");
		q.setFirstResult(1);
		q.setMaxResults(3);
		
		List<Student> student = q.list();
		for(Student s:student) {
			System.out.print(s.getRollNum());
			System.out.print(s.getName());
			System.out.print(s.getMark());
			System.out.println();
		}*/
		
		/*//update query
		Query q=session.createQuery("update Student set name=:n where rollNum=:i");
		q.setParameter("n", "Ajith");
		q.setParameter("i", 4);
		int status = q.executeUpdate();
		System.out.println(status);*/
		
		/*//delete query
		Query q=session.createQuery("delete from Student where rollNum=3");
		int status = q.executeUpdate();
		System.out.println(status);*/
		
		
		/*//using Aggreate funcations
		//total mark for all student
		Query q=session.createQuery("select sum(mark) from Student");
		List<Integer> l=q.list();
		System.out.println(l.get(0));
		
		TypedQuery q1=session.getNamedQuery("GetRecordByName");
		
		
		List<Student> resultList = q1.getResultList();
		Iterator<Student> iterator = resultList.iterator();
		while(iterator.hasNext()) {
			Student next = iterator.next();
			System.out.println(next);
		}*/
		
		tx.commit();
		sf.close();

	}

}
