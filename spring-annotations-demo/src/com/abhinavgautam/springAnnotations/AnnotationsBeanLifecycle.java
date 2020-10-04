package com.abhinavgautam.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanLifecycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("theTennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		context.close();
	}
}