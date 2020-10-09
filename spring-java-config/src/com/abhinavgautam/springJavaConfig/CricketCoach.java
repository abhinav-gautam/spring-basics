package com.abhinavgautam.springJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	FortuneService fortuneService;


	// Method Injection
	@Autowired
	public void methodNameCanBeAnything(@Qualifier("coachFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket Coach: Practice cover drive";
	}

	@Override
	public String getFortune() {
		return "Cricket Coach: " + fortuneService.getFortune();
	}
}
