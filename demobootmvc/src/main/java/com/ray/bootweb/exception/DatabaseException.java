package com.ray.bootweb.exception;

public class DatabaseException extends Exception {

	private String msg;
	public DatabaseException(String message) {
		msg = message;
	}
	public DatabaseException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public DatabaseException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public DatabaseException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
