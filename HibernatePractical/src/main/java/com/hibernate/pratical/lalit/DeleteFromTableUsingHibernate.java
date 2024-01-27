package com.hibernate.pratical.lalit;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteFromTableUsingHibernate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// Delete all record using HQL
		/*
		 * Query query = session.createQuery("delete from Student"); int result =
		 * query.executeUpdate(); System.out.println("Number of records deleted: " +
		 * result); tx.commit(); session.close();
		 */

		// Delete single record using HQL
		Query query = session.createQuery("delete from Student where id = :id");
		query.setParameter("id", 18);

		int result = query.executeUpdate();
		System.out.println("Number of records deleted: " + result);

		tx.commit();
		session.close();
	}
}
