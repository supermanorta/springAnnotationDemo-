package com.luv2Code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the spring contatiner
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach aplhaCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach == aplhaCoach);
		System.out.println("Memory location of theCoach " + theCoach);
		System.out.println("Memory location of aplhaCoach " + aplhaCoach);
		context.close();

	}

}
