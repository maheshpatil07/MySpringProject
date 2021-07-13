package com.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController 
{
	@RequestMapping("/login")
	public String showLoginPage()
	{
		System.out.println("===Login Page Creation===");
		return "Login";
	}
	
	@RequestMapping("/signup")
	public String showSignUpPage()
	{
		System.out.println("===SignUp Page Creation===");
		return "Register";
	}
	

}
