package com.abhinavgautam.springAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theTennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach {

	FortuneService fortuneService;
	
	// Constructor Injection
	@Autowired
	public TennisCoach(@Qualifier("societyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Tennis Coach: Practice volley";
	}

	@Override
	public String getFortune() {
		return "Tennis Coach: "+fortuneService.getFortune();
	}
	
	@PostConstruct
	public void startupStuff() {
		System.out.println("Tennis Coach: Startup stuff");
	}
	
	@PreDestroy
	public void cleanupStuff() {
		System.out.println("Tennis Coach: Cleanup stuff");
	}

}
