package com.abhinavgautam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}
}