package com.spring.core.practical.scopewithxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/practical/scope/config.xml");
		Student st=(Student) context.getBean("scope");
		System.out.println(st);
		System.out.println(st.hashCode());
		
		Student st1=(Student) context.getBean("scope");
		System.out.println(st1);
		System.out.println(st1.hashCode());
	}

}
