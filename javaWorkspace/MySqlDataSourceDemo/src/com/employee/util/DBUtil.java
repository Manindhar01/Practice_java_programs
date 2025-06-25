package com.employee.util;

import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.*;

public class DBUtil {
	
	private static final String db_url="url";
	private static final String db_name="username";
	private static final String db_password="password";
	
	private static Properties properties=null;
	private static MysqlDataSource dataSource;
	
	static{
		properties=new Properties();
		try {
			properties.load(new FileInputStream("src/database.properties"));
			dataSource=new MysqlDataSource();
			dataSource.setUrl(properties.getProperty(db_url));
			dataSource.setUser(properties.getProperty(db_name));
			dataSource.setPassword(properties.getProperty(db_password));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		public static DataSource getDataSource() {
			return dataSource;
			
		}
	}


