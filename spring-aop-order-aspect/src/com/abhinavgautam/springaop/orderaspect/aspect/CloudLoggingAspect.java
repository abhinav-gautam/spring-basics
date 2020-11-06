package com.abhinavgautam.springaop.orderaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class CloudLoggingAspect {
	@Before("com.abhinavgautam.springaop.orderaspect.aspect.PointcutExpressions.packageNoGetterSetter()")
	public void logToCloud() {
		System.out.println("Advice => Logging to cloud");
	}
}
