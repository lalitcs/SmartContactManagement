package com.spring.core.practical.autowiring.Annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/practical/autowiring/Annotaion/config.xml");
		Student st=(Student) context.getBean("StudentBean");
		System.out.println(st);
	}

}