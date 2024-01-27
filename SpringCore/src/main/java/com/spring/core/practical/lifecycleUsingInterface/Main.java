package com.spring.core.practical.lifecycleUsingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
	public static void main(String[] args) throws Exception {
		ApplicationContext cotext = new ClassPathXmlApplicationContext(
				"com/spring/core/practical/lifecycleUsingInterface/config.xml");
		Student st = (Student) cotext.getBean("Interface1", Student.class);
		System.out.println(st);
		st.destroy();
		
	}

	

	

}
