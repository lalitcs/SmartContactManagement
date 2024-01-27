package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/home")
	public String Home()
	{
		return "I am home page";
	}
	
	@GetMapping("/about")
	public String About()
	{
		return "I am about page";
	}
	@GetMapping("/hi")
	public String Hi()
	{
		return "Hi welcome to page";
	}
	
	@GetMapping("/ha")
	public String Haaa()
	{
		return "Hi welcome to page of haaaa";
	}
	
	@GetMapping("/haa")
	public String Haaaa()
	{
		return "Hi welcome to page of haaaa";
	}
	
	
	
	

}