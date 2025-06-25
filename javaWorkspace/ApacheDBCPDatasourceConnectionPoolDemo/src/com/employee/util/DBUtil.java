package com.employee.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.*;

public class DBUtil {
	
	private static final String db_url="url";
	private static final String db_name="username";
	private static final String db_password="password";
	
	private static Properties properties=null;
	private static BasicDataSource dataSource;
	
	static{
		properties=new Properties();
		try {
			properties.load(new FileInputStream("src/database.properties"));
			dataSource=new BasicDataSource();
			dataSource.setUrl(properties.getProperty(db_url));
			dataSource.setUsername(properties.getProperty(db_name));
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


