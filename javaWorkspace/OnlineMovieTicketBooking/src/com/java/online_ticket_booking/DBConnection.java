package com.java.online_ticket_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {
	
	public static final String url="jdbc:mysql://localhost:3306/ticketbooking";
	public static final String name="root";
	public static final String password="Mani123";
	
	public static Connection getConnection() throws SQLException{
			return DriverManager.getConnection(url,name,password);
	}
}



