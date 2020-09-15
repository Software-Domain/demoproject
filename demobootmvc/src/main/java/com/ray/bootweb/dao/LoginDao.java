package com.ray.bootweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ray.bootweb.bean.User;
import com.ray.bootweb.exception.DatabaseException;


public class LoginDao {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean login(User user) throws DatabaseException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = LoginDao.getConnection();
			st = con.prepareStatement("select * from user where userid=? and password=?");
			st.setString(1, user.getUserid());
			st.setString(2, user.getPassword());
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DatabaseException(e.getMessage());
		}finally {
			try {
				st.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return false;
	}
}
