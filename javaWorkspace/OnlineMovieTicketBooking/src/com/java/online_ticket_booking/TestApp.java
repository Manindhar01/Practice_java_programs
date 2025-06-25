package com.java.online_ticket_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAdminOrUser cau=new CheckAdminOrUser();
		cau.check();

	}

}
