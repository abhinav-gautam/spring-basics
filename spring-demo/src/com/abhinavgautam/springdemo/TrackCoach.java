package com.abhinavgautam.springdemo;

public class TrackCoach implements Coach {
	
	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	// Create a constructor for dependency injections
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard for 5km";
	}

	@Override
	public String getDailyFortune() {
		return "From the trach coach:" + fortuneService.getFortune();
	}
	
	public void startupStuff() {
		System.out.println("Track Coach: Startup stuff");
	}
	
	public void cleanupStuff() {
		System.out.println("Track Coach: Cleanup stuff");
	}
}
