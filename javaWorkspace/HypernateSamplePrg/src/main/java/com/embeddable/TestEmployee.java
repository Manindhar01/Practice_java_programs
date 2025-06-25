package com.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		EmployeeName empName=new EmployeeName();
		empName.setFname("Caption");
		empName.setMname("Velupillai");
		empName.setLname("Prabhakaran");
		
		Employee emp=new Employee();
		emp.setEmpid(1);
		emp.setEmpName(empName);
		emp.setRole("Team Leader");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction bt = session.beginTransaction();
		session.save(emp);
		bt.commit();
		
	}

}
