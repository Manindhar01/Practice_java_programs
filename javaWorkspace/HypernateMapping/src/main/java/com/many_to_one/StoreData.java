package com.many_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setName("Sanjay");
		
		Employee e1=new Employee();
		e1.setName("gopi");
		
		Address a=new Address();
		a.setAddressLine1("orathanadu");
		a.setCity("trichy");
		a.setState("kerala");
		a.setCountry("India");
		a.setPinCode(323434);
		
		e.setAddress(a);
		e1.setAddress(a);
		a.setEmloyee(e);
		a.setEmloyee(e1);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Address.class).addAnnotatedClass(Employee.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		session.save(e1);
		tx.commit();
		sf.close();
	}

}
