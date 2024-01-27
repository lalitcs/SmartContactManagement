package com.spring.core.practical.collection.map.type.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/spring/core/practical/collection/map/type/injection/config.xml");
		Employee emp=(Employee)context1.getBean("emp1");
		System.out.println(emp);
	}

}
