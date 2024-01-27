package com.hibernate.pratical.lalit;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchDataFromDbUsingHibernate {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);

		// fetch data from db using get()

		/*
		 * Session s1 = factory.openSession(); Student s2 = s1.get(Student.class, 2);
		 * System.out.println("Id : " + s2.getId()); System.out.println("Name : " +
		 * s2.getName()); System.out.println("City : " + s2.getCity());
		 * System.out.println("Company :" + s2.getCompany());
		 * System.out.println("Salary :" + s2.getSalary());
		 */

		// fetch data from db using load()
//
//		Session s3 = factory.openSession();
//		Student s4 = s3.load(Student.class, 9);
//		System.out.println("Id : " + s4.getId());
//		System.out.println("Name : " + s4.getName());
//		System.out.println("City : " + s4.getCity());
//		System.out.println("Company :" + s4.getCompany());
//		System.out.println("Salary :" + s4.getSalary());
		Session s3 = factory.openSession();
		Transaction transaction = s3.beginTransaction();
		Query<Student> query=s3.createQuery("from Student", Student.class);
		List<Student> list=query.list(); 
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		transaction.commit();
		s3.close();

	}
}
