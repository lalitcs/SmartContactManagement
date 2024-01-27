package com.spring.jdbc.practical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ioc container creating connection by reading configuration file or xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/practical/config.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate1");
		System.out.println(template);

		// create table
//    String query="create table student(id int primary key auto_increment,name varchar(20),city varchar(20),company varchar(20))";
//     System.out.println("table created"+template.update(query));
		// insert into table
//	String st="insert into student (name,city,company) values('amarjeet','patna','edifecs')";
//	System.out.println("data inserted: "+template.update(st));
//	drop table
//	String st1="drop table student";
//	System.out.println(template.update(st1));
		// update table
		/*
		 * String update="update student set name='lalit' where id=1";
		 * System.out.println(template.update(update));
		 */
		
		
		

	}
}
