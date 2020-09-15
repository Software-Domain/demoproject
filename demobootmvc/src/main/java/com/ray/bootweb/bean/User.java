package com.ray.bootweb.bean;

public class User {

	private String userid;
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userid=").append(userid).append(", password=").append(password).append("]");
		return builder.toString();
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
