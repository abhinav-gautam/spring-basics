package com.abhinavgautam.springdemo;

public class MyApp {
	
	static FortuneService fortuneService = new CoachFortuneService();   

	public static void main(String[] args) {
		// Create the object
		Coach theCoach = new BaseballCoach(fortuneService);
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
		// Create the object
		Coach trackCoach = new TrackCoach(fortuneService);
		// Use the object
		System.out.println(trackCoach.getDailyWorkout());
	}

}
