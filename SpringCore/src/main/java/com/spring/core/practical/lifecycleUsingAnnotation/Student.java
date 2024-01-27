package com.spring.core.practical.lifecycleUsingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int id;
	private String name;
	private String city;
	private String college;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, String college) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", college=" + college + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("calling init() using postConstruct annotaion...");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("calling destroy() method using preDestroy annotaion...");
	}

}
