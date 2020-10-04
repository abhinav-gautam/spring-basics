package com.abhinavgautam.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
	// Field Injection
	@Autowired
	@Qualifier("managerFortuneService")
	FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Soccer Coach: Practice Dribbling";
	}

	@Override
	public String getFortune() {
		return "Soccer Coach: " + fortuneService.getFortune();
	}
	
}
