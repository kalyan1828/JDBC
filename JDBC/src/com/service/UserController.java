package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.User;
import com.model.GetConnection;

public class UserController {
	PreparedStatement st;
	static Connection con= GetConnection.getConnection();
	
	static ResultSet rs;
	public int insertUser(User user) {
		try {
			st =con.prepareStatement("insert into user(id,name,schoolname) values(?,?,?);");
			st.setInt(1, user.getId());
			st.setString(2, user.getName());
			st.setString(3, user.getSchool());
			return st.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		return 0;
		
	}
	public int deleteUser(User user) {
		try {
			st=con.prepareStatement("delete from user where id=?;");
			st.setInt(1, user.getId());
			return st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
	public int viewUser(User user) {
		try {
			st=con.prepareStatement("select * from user;");
			ResultSet rs=st.executeQuery();
			//rs.next();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+ rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	public int insertUserBYId(User user,int id) {
		return 0;
		
	}

}
