package com.java.online_ticket_booking;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Calendar;

public class Booking_details {
	public static int bookticket(int n,int i,int j) {
		try {
			int s=n*i;
			Connection con=DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into bookinglist(m_id,booking_time,booking_date,no_ofticket,total) values(?,?,?,?,?)");
			ps.setInt(1, j);
			
			Time currentTime = new Time(Calendar.getInstance().getTimeInMillis());
			ps.setTime(2, currentTime);
			Date currentDate = new Date(Calendar.getInstance().getTimeInMillis());
			ps.setDate(3, currentDate);
			ps.setInt(4, i);
			ps.setInt(5, s);
			int rows = ps.executeUpdate();
			System.out.println("number of rows affected"+rows);
			PreparedStatement ps1 = con.prepareStatement("select*from bookticket where m_id=? ");
			ps1.setInt(1,j);
		
			ResultSet rs = ps1.executeQuery();
			while(rs.next()) {
				System.out.println("booking id: "+rs.getInt(1));
				System.out.println("movie id: "+rs.getInt(2));
				System.out.println("booking time: "+rs.getTime(3));
				System.out.println("booking date: "+rs.getDate(4));
				System.out.println("no of ticket: "+rs.getInt(5));
				System.out.println("total price: "+rs.getInt(6));
				System.out.println();
			}
			PreparedStatement ps2= con.prepareStatement("update movielist avl_seats-? where id=?");
			ps2.setInt(1,j);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

}
