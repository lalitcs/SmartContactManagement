package com.spring.core.practical.lifecycleUsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleUsingInitanddestroyMethod {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/practical/lifecycle/config.xml");
		Student st = (Student) context.getBean("amarjeet");
		System.out.println(st);
		((AbstractApplicationContext) context).registerShutdownHook();// this is used to call the destroy method
	}

}
