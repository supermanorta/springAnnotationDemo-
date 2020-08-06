package com.luv2Code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { "Beware of the wolf", "Diligence is the mother of good luck", "The trip is the reward" };
	private Random myRan = new Random();

	@Override
	public String getFortune() {
		int index = myRan.nextInt(data.length);
		String theForture = data[index];
		return theForture;
	}

}
