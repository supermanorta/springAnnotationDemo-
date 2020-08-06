package com.luv2Code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortService;

	@Value("${foo.email}") // comes in from the sport.properties file
	private String email;

	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService injectfortService) {
		fortService = injectfortService;
	}

	@Override
	public String dailyWorkOut() {
		// TODO Auto-generated method stub
		return "Swim 1k meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
