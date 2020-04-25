package com.forgyan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forgyan.teacher.Teacher;

public class SpringApp {
	public static void main(String[] args) {
		// load the Spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container
		Teacher teacher = context.getBean("englishTeacher", Teacher.class);
		
		// call methods on bean
		System.out.println(teacher.teach());
		System.out.println(teacher.train());
		
		// close application context
		context.close();
	}
}
