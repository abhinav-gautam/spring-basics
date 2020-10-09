package com.abhinavgautam.springJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfigScan.class);
		
		Coach cricketCoach = context.getBean("cricketCoach",Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getFortune());
		
		context.close();
	}
}
