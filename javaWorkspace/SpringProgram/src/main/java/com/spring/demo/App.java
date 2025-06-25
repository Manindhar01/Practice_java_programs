package com.spring.demo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		Car bean = (Car) factory.getBean("car");
		bean.drive();

	}

}
