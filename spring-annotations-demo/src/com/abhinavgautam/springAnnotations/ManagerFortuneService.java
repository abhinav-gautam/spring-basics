package com.abhinavgautam.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class ManagerFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day from the Manager";
	}

}
