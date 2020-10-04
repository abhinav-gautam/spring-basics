package com.abhinavgautam.springdemo;

public class CoachFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you'll get a job";
	}

}
