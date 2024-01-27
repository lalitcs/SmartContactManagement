package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/home")
	public String Home()
	{
		return "This is user home page content";
	}
	
	@GetMapping("/dashboard")
	public String Dashboard()
	{
		return "This is user dashboard page content";
	}
	
}