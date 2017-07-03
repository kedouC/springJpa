package com.jpa.lwk.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpa.lwk.dao.UserRepository;
import com.jpa.lwk.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userSer;
	
	@RequestMapping("login")
	public void index(Model model){
		model.addAttribute("list", userSer.getAllUser());
	}
	
}
