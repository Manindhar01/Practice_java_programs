package com.java.online_ticket_booking;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Scanner;



public class Admin{
	
     public static void modify() {
    	 System.out.println("enter 1-view,2-insert,3-delete,4-update,5-alter");
    	 Scanner sc=new Scanner(System.in);
    	 int i=sc.nextInt();
    	 switch(i) {
    	 case 1:
    		 view();
    		 break;
    	 case 2:
    		 insert();
    		 break;
    	 case 3:
    		 delete();
    		 break;
    	 case 4:
    		 update();
    		 break;
    	 case 5:
    		 alter();
    		 break;
    		 default:
    			 System.out.println("you enter wrong input");
    	 }
     }
	
	public static void view() {
		try {
			Connection con=DBConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select*from movielist");
			while(rs.next()) {
				System.out.println("id: "+rs.getInt(1));
				System.out.println("movie name: "+rs.getString(2));
				System.out.println("price: "+rs.getInt(3));
				System.out.println("show time: "+rs.getTime(4));
				System.out.println("show date: "+rs.getDate(5));
				System.out.println("seats available:"+rs.getInt(6));
				System.out.println();
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void insert() {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into movielist values(?,?,?,?,?,?)");
			Scanner s=new Scanner(System.in);
			System.out.println("insert new movies");
			int n1=s.nextInt();
			ps.setInt(1, n1);
			String n2=s.next();
			ps.setString(2, n2);
			int n3=s.nextInt();
			ps.setInt(3, n3);
			String n4=s.next();
			Time t=Time.valueOf(n4);
			ps.setTime(4,t);
			String n5=s.next();
			Date d=Date.valueOf(n5);
			ps.setDate(5, d);
			int n6=s.nextInt();
			ps.setInt(6, n6);
			int rows = ps.executeUpdate();
			System.out.println("number of rows affected: "+rows);
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void delete() {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("delete table movielist where id=?");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			ps.setInt(1, n);
			int rows = ps.executeUpdate();
			System.out.println("no of rows affected:"+rows);
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void update() {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("update movielist set mname=? where id=?");
			Scanner s=new Scanner(System.in);
			String n1=s.next();
			ps.setString(1, n1);
			int n2=s.nextInt();
			ps.setInt(2, n2);
			int rows = ps.executeUpdate();
			System.out.println("no of rows affected"+rows);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void alter() {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("alter table movielist drop column ?");
			Scanner s=new Scanner(System.in);
			String n=s.next();
			ps.setString(1,n);
			int rows = ps.executeUpdate();
			System.out.println("no of rows affected"+rows);
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
