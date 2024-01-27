package com.hibernate.pratical.lalit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateDataInDBUsingHibernate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		
		
        Session session=factory.openSession(); 
        Transaction t=session.beginTransaction(); 
          
        Student s=session.load(Student.class, 3); 
        s.setCity("Pune");
        s.setName("Lalit");
        session.save(s); 
        t.commit(); 
          
        session.close(); 
	}

}
