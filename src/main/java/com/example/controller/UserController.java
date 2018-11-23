package com.example.controller;

import com.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	com.example.Service.UserService UserService;
	
	/*@RequestMapping("/list")
	public String List(Model model,){
		UserService.userList();
	}*/
	@RequestMapping("/login")
	public String loginPage(){
		return "loginPage";
	}
}
