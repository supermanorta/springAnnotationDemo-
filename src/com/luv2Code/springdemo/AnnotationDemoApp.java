package com.luv2Code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the spring contatiner
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call the method on the bean
		System.out.println(theCoach.dailyWorkOut());

		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
