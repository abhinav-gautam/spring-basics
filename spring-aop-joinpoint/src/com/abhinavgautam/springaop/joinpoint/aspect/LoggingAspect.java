package com.abhinavgautam.springaop.joinpoint.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.abhinavgautam.springaop.joinpoint.Account;

@Aspect
@Component
@Order(3)
public class LoggingAspect {

	@Before("com.abhinavgautam.springaop.joinpoint.aspect.PointcutExpressions.packageNoGetterSetter()")
	public void logToConsole(JoinPoint joinPoint) {
		System.out.println("Advice => Logging to console.");
		
		// Getting method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Logging Aspect => Method Signature - "+methodSignature);
		
		// Getting args
		Object[] args = joinPoint.getArgs();
		for(Object arg : args) {
			System.out.println("Logging Aspect => Argument - "+arg);
			if(arg instanceof Account) {
				Account account = (Account) arg;
				System.out.println("Logging Aspect => Account name - "+account.getName());
			}
		}
	}

}
