package com.one_to_one;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address();
		a.setAddressLine1("pappanadu");
		a.setCity("Thanjavur");
		a.setState("Tamilnadu");
		a.setCountry("India");
		a.setPinCode("614 626");
		
		
		Employee e=new Employee();
		e.setName("hari");
		e.setEmail("hari@123.com");
		e.setAddress(a);
		
		a.setEmployee(e);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		session.save(a);
		
		
		tx.commit();
		sf.close();

	}

}
