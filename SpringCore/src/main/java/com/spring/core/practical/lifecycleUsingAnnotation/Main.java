package com.spring.core.practical.lifecycleUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/practical/lifecycleUsingAnnotation/config.xml");
		Student st = (Student) context.getBean("Annotaion");
		System.out.println(st);
		st.destroy();

	}

}
