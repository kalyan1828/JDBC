package com.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	
	 public static  Connection getConnection() {
		 String url="jdbc:mysql://localhost:3306/user";
			String username="root";
			String password="root";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
