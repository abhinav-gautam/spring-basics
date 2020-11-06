package com.abhinavgautam.springaop.aroundexception;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhinavgautam.springaop.aroundexception.service.TrafficService;

public class MainApp {

	public static void main(String[] args) {
		// Read the spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// Get the bean from the spring container
		TrafficService trafficService = context.getBean("trafficService", TrafficService.class);

		String result = trafficService.getStatus(true);
		
		System.out.println("MainApp => Traffic Status - " + result);

		// Close the context
		context.close();
	}
}
