package com.ray.bootweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.bootweb.bean.User;
import com.ray.bootweb.dao.LoginDao;
import com.ray.bootweb.exception.DatabaseException;

@Service
public class LoginService {
	
	LoginDao dao;
	
	public boolean checkLogin(User user) throws DatabaseException {
		dao = new LoginDao();
		if(dao.login(user)) {
			return true;
		}
		return false;
	}
}
