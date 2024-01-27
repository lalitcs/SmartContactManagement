package com.spring.core.practical.constructor.injection;

public class Student {

	private String id;
	private String name;
	private String city;
	private String company;

	public Student(String id, String name, String city, String company) {

		this.id = id;
		this.name = name;
		this.city = city;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", company=" + company + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	void disp() {
//		System.out.println(name + ":" + city + ":" + company);
//	}

}
