package com.hypernate_query_interface;

import org.hibernate.cfg.Configuration;

public class ToStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Configuration().configure().addAnnotatedClass(Student.class);
		

	}

}
