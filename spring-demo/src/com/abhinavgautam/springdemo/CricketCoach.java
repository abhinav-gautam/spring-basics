package com.abhinavgautam.springdemo;

public class CricketCoach implements Coach {

	FortuneService fortuneService;

	private String email;
	private String team;

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket Coach: No arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: Fortune service setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket Coach: Get daily workout";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach Fortune:" + fortuneService.getFortune();
	}
	
	public String getCoachInformation() {
		return "Cricket Coach: Email-" + email + " Team-" + team;
	}
}
