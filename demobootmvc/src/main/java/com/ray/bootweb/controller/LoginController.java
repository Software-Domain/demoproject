package com.ray.bootweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ray.bootweb.bean.User;
import com.ray.bootweb.exception.DatabaseException;
import com.ray.bootweb.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String doLogin(ModelMap model, @RequestParam String userid, @RequestParam String pass) {
		User user = new User(userid, pass);
		boolean check = false;
		try {
			check = service.checkLogin(user);
		} catch (DatabaseException e) {
			model.addAttribute("errorMsg", "There is some problem try after some time!! ");
			e.printStackTrace();
		}
		if(check) {
			model.addAttribute("name", userid);
			return "welcome";
		}else
			model.addAttribute("errorMsg", "Wrong Credencial!! ");
		
		return "login";
	}

}
