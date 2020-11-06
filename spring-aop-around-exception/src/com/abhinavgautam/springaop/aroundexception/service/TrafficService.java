package com.abhinavgautam.springaop.aroundexception.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficService {
	public String getStatus(boolean throwException) {
		if (throwException) {
			throw new RuntimeException("Exception in getStatus");
		}
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Heavy Traffic";
	}
}
