package com.abhinavgautam.springaop.around.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Around("execution(* com.abhinavgautam.springaop.around.service.*.getStatus(..))")
	public Object aroundGetStatus(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		// Print out the method we are advising on
		String method = proceedingJoinPoint.getSignature().toShortString();
		System.out.println("Around Advice => Method - " + method);

		// Begin timestamp
		long begin = System.currentTimeMillis();

		// Execute the method
		Object result = proceedingJoinPoint.proceed();

		// End timestamp
		long end = System.currentTimeMillis();

		// Compute the duration and display it
		double duration = (end - begin) / 1000.0;
		System.out.println("Around Advice => Duration - " + duration + "secs");

		return result;
	}

}
