package com.abhinavgautam.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Coach firstCoach = context.getBean("theTennisCoach",Coach.class);
		Coach secondCoach = context.getBean("theTennisCoach",Coach.class);
		
		// Check if they are the same
		boolean isSame = firstCoach == secondCoach;
		
		// Printing memory location
		System.out.println("isSame:"+isSame);
		System.out.println("Memory location of firstCoach:" + firstCoach);
		System.out.println("Memory location of secondCoach:" + secondCoach);
		
		context.close();
	}
	
}
