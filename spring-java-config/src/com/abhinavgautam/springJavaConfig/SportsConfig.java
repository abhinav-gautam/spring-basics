package com.abhinavgautam.springJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
public class SportsConfig {
	
	// Define a bean for coach fortune service
	@Bean
	public FortuneService coachFortuneService() {
		return new CoachFortuneService();
	}
	
	//  Define a bean for the swim coach and inject dependencies
	@Bean
	public Coach swimCoach() {		
		return new SwimCoach(coachFortuneService());
	}
}
