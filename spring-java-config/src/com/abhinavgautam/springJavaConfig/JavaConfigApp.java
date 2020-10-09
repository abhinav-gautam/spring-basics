package com.abhinavgautam.springJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getFortune());
		System.out.println(swimCoach.getCoachInfo());
		context.close();
	}
}
