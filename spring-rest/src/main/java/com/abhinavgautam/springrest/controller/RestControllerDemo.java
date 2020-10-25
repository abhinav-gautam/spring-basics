package com.abhinavgautam.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestControllerDemo {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hellow World from Rest";
	}
}
