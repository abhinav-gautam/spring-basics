package com.abhinavgautam.springaop.orderaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class LoggingAspect {

	@Before("com.abhinavgautam.springaop.orderaspect.aspect.PointcutExpressions.packageNoGetterSetter()")
	public void logToConsole() {
		System.out.println("Advice => Logging to console.");
	}

}
