package com.abhinavgautam.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 30 Mins";
	}

	@Override
	public String getDailyFortune() {
		return "From the baseball coach:"+fortuneService.getFortune();
	}
	
}
