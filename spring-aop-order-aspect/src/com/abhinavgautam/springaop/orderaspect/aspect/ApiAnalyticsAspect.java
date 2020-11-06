package com.abhinavgautam.springaop.orderaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class ApiAnalyticsAspect {
	@Before("com.abhinavgautam.springaop.orderaspect.aspect.PointcutExpressions.forDaoPackage()")
	public void performingApiAnalytics() {
		System.out.println("Advice => Performing api analytics");
	}

}
