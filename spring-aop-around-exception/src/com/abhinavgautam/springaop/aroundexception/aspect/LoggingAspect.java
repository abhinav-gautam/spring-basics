package com.abhinavgautam.springaop.aroundexception.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Around("execution(* com.abhinavgautam.springaop.aroundexception.service.*.getStatus(..))")
	public Object aroundGetStatus(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		// Print out the method we are advising on
		String method = proceedingJoinPoint.getSignature().toShortString();
		System.out.println("Around Advice => Method - " + method);

		// Execute the method
		Object result = null;
		try {
			result = proceedingJoinPoint.proceed();
		} catch (Exception e) {
			System.out.println("Around Advice => Exception - " + e);
			result = "Status unknown for now";
		}
		return result;
	}

}
