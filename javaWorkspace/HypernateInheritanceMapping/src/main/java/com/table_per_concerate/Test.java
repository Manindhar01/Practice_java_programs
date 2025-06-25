package com.table_per_concerate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(1);
		e.setName("hari");
		
		Regular_Employee re=new Regular_Employee();
		re.setId(2);
		re.setName("sanjay");
		re.setSalary(20000);
		re.setBonus(1000);
		
		Contract_Employee ce=new Contract_Employee();
		ce.setId(3);
		ce.setName("vickey");
		ce.setPay_per_hour(500);
		ce.setContract_duration("3 years");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Regular_Employee.class).addAnnotatedClass(Contract_Employee.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		session.save(re);
		session.save(ce);
		
		tx.commit();
		sf.close();

	}

}
