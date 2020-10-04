package com.abhinavgautam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopes {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanScopes-applicationContext.xml");
		
		Coach firstCoach = context.getBean("myCoach",Coach.class);
		Coach secondCoach = context.getBean("myCoach",Coach.class);
		
		// Check if they are the same
		boolean isSame = firstCoach == secondCoach;
		
		// Printing memory location
		System.out.println("isSame:"+isSame);
		System.out.println("Memory location of firstCoach:" + firstCoach);
		System.out.println("Memory location of secondCoach:" + secondCoach);
	}
}
