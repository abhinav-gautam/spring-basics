package com.abhinavgautam.springJavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	@Value("${swimCoach.email}")
	private String email;
	@Value("${swimCoach.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim Coach: Practice back swim";
	}

	@Override
	public String getFortune() {
		return "Swim Coach:" + fortuneService.getFortune();
	}
	
	public String getCoachInfo() {
		return "Swim Coach: Email: " + email + " Team: " + team;
	}
}
