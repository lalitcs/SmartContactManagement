package com.hibernate.pratical.lalit;

import java.sql.*;
import java.util.*;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mysql.cj.xdevapi.SessionFactory;

public class App {
	public static void main(String[] args) {

		/*
		 * org.hibernate.SessionFactory factory=new
		 * Configuration().configure().buildSessionFactory();
		 * System.out.println(factory);
		 */
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);

//		Student s1=new Student();
//		s1.setName("Amarjeet");
//		s1.setCity("Patna");
//		s1.setCompany("Edifecs");
//		s1.setSalary(63000);
//		
//		Student s2=new Student();
//		s2.setName("Sanjeet");
//		s2.setCity("Siwan");
//		s2.setCompany("Aimdek");
//		s2.setSalary(20000);
//		
//		Student s3=new Student();
//		s3.setName("Lalit");
//		s3.setCity("Patna");
//		s3.setCompany("TCS");
//		s3.setSalary(30000);
//		
//		Student s4=new Student();
//		s4.setName("Rajnish");
//		s4.setCity("Patna");
//		s4.setCompany("L&T");
//		s4.setSalary(10000);
//		
//		Session session=factory.openSession();
//		Transaction tx=session.beginTransaction();
//		session.save(s2);
//		tx.commit();
//		session.close();

		Student st = new Student();
		
		st.setName("Abhay");
		st.setCity("Bangalore");
		st.setCompany("IQVIA");
		st.setSalary(10);

		/*
		 * Address add = new Address(); add.setName("Lalit"); add.setStreet("Sakari");
		 * add.setCity("Patna"); add.setAddedDate(new Date(0, 0, 0));
		 */

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(st);
		tx.commit();
		s.close();

		// fetch data from db using get()
		/*
		 * Session s1 = factory.openSession(); Student s2 = s1.get(Student.class, 110);
		 * System.out.println("Id : " + s2.getId()); System.out.println("Name : " +
		 * s2.getName()); System.out.println("City : " + s2.getCity());
		 * System.out.println("Company :" + s2.getCompany());
		 * System.out.println("Salary :" + s2.getSalary());
		 * 
		 * // fetch data from db using load() Session s3 = factory.openSession();
		 * Student s4 = s1.load(Student.class, 110); System.out.println("Id : " +
		 * s4.getId()); System.out.println("Name : " + s4.getName());
		 * System.out.println("City : " + s4.getCity()); System.out.println("Company :"
		 * + s4.getCompany()); System.out.println("Salary :" + s4.getSalary());
		 */

		// s1.close();

	}
}
