package com.abhinavgautam.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach tennisCoach = context.getBean("theTennisCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getFortune());

		Coach chessCoach = context.getBean("chessCoach", Coach.class);
		System.out.println(chessCoach.getDailyWorkout());
		System.out.println(chessCoach.getFortune());

		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getFortune());
		System.out.println(cricketCoach.getCoachInfo());

		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		System.out.println(soccerCoach.getDailyWorkout());
		System.out.println(soccerCoach.getFortune());

		context.close();
	}

}
