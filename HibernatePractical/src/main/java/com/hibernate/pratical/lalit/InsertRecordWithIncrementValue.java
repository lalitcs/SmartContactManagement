package com.hibernate.pratical.lalit;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecordWithIncrementValue {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// Insert multiple records using Hibernate

		for (int i = 1; i <= 3; i++) {
			Student student = new Student();
			student.setName("Amarjeet Singh");
			student.setCompany("Edifecs");
			student.setCity("Patna");
			student.setSalary(30000);

			session.save(student);
		}

		tx.commit();
		System.out.println("Records inserted successfully.");

		session.close();

	}
}