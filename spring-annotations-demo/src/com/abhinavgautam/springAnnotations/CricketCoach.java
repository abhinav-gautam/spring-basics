package com.abhinavgautam.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	FortuneService fortuneService;
	
	// Property injection from properties file
	@Value("${cricketCoach.email}")
	private String email;
	@Value("${cricketCoach.team}")
	private String team;

	// Method Injection
	@Autowired
	public void methodNameCanBeAnything(@Qualifier("managerFortuneService") FortuneService fortuneService) {
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
	
	public String getCoachInfo() {
		return "Cricket Coach: Email: " + email + " Team: " + team;
	}
}
