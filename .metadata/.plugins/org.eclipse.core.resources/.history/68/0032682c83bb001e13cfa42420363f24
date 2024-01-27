package com.spring.core.practical.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/practical/autowiring/xml/config.xml");
		Student st=(Student) context.getBean("StudentBean");
		System.out.println(st);
	}

}
