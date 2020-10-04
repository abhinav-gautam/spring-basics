package com.abhinavgautam.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach{

	FortuneService fortuneService;
	
	// Setter Injection
	@Autowired
	public void setFortuneService(@Qualifier("coachFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Chess Coach: Practice Queens Gambit";
	}

	@Override
	public String getFortune() {
		return "Chess Coach: " + fortuneService.getFortune();
	}
	
}
