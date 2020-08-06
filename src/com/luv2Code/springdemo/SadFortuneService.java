package com.luv2Code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "sad sad day";
	}

}
