package com.employee.list;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.employee.util.DBUtil;

public class TestEmployee {
	public static void main(String[] args) {
		try (
		Connection con=DBUtil.getDataSource().getConnection();
		Statement st=con.createStatement();){
		ResultSet rs = st.executeQuery("select* from emp");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String job=rs.getString(3);
			int salary=rs.getInt(4);
			int branch=rs.getInt(5);
			System.out.println(id+"\t"+name+"\t"+job+"\t"+salary+"\t"+branch);
		}
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		
		
	
	

}
