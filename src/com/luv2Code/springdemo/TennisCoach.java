package com.luv2Code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") this is an example of an explsive bean id, the defult will ref the class name, with the 1st charater lower case
//recall that when it gets used, you will have to update the context
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired // using reflection for setters so we do not need a setter method type out.
	@Qualifier("randomFortuneService")
	private FortuneService fortService;

	@PreDestroy
	public void cleanUp() {
		System.out.println(">> TennisCoach cleanUp");

	}

	@PostConstruct
	public void atStartUp() {
		System.out.println(">> TennisCoach atStartUp");

	}

	public TennisCoach() {
		System.out.println(">> TennisCoach defualt constructor");
	}
	/*
	 * //@Autowired // if you only have one constructor you do not need to place the
	 * autowired above however we are being explict here public TennisCoach(
	 * FortuneService theFort ) { fortService = theFort; }
	 *//*
		 * @Autowired public void setFortuneService(FortuneService fortSer) {
		 * this.fortService = fortSer;
		 * System.out.println(">> autowire TennisCoach Setter"); }
		 */
	// @Autowired
	// public String getFortuneService() {
	// return this.g
	// }

	@Override
	public String dailyWorkOut() {
		return "practice your overhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortService.getFortune();
	}

}
