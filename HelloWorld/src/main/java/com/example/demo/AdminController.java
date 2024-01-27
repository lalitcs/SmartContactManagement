package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/home")
	public String Home()
	{
		return "This is admin home page content";
	}
	
	@GetMapping("/dashboard")
	public String Dashboard()
	{
		return "This is admin dashboard page content";
	}
	
}
