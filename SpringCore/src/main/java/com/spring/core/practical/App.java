package com.spring.core.practical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.practical.collection.map.type.injection.Employee;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/practical/config.xml");
		Student student=(Student)context.getBean("lalit");
		System.out.println(student);
		
		Student student1=(Student)context.getBean("lalit1");
		System.out.println(student1);
		

		Student student2=(Student)context.getBean("lalit2");
		System.out.println(student2);
		
		
		
	}
}
