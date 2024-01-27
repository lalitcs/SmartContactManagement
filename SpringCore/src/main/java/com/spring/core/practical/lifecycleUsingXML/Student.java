package com.spring.core.practical.lifecycleUsingXML;

public class Student {
	private String name;
	private String city;
	private String college;
	private String company;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Student(String name, String city, String college, String company) {
		super();
		this.name = name;
		this.city = city;
		this.college = college;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", college=" + college + ", company=" + company + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("This is init() method calling...");
	}

	public void destroy() {
		System.out.println("this is destroy caling...");
	}

}
