package com.luv2Code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	public static void main(String[] args) {
		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);// Here
																												// is
																												// where
																												// the
																												// Spring
																												// Framework
																												// will
																												// read.

		// get the bean from the spring container, the object
		SwimCoach swim = context.getBean("swimCoach", SwimCoach.class);
		// call a method on the bean
		System.out.println(swim.dailyWorkOut());
		// call method to get the daily fortune
		System.out.println(swim.getDailyFortune());
		System.out.println("Email from sport.properties" + swim.getEmail());
		System.out.println("Teams from sport.properties" + swim.getTeam());
		// close the context
		context.close();
	}
}
