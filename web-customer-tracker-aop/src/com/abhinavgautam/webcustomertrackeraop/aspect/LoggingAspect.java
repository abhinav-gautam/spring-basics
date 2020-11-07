package com.abhinavgautam.webcustomertrackeraop.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	// Setup logger
	private Logger logger = Logger.getLogger(getClass().getName());

	// Setup pointcut declarations
	@Pointcut("execution(* com.abhinavgautam.webcustomertrackeraop.controller.*.*(..))")
	private void forControllerPackage() {
	}

	@Pointcut("execution(* com.abhinavgautam.webcustomertrackeraop.dao.*.*(..))")
	private void forDaoPackage() {
	}

	@Pointcut("forControllerPackage() || forDaoPackage()")
	private void forAppFlow() {
	}

	// Before Advice
	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {
		// Display the calling method
		String method = joinPoint.getSignature().toShortString();
		logger.info("[+] @Before => Calling Method - " + method);

		// Get the args
		Object[] args = joinPoint.getArgs();

		for (Object arg : args) {
			logger.info("[+] @Before => Argument - " + arg);
		}
	}

	// After Returning Advice
	@AfterReturning(pointcut = "forAppFlow()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		// Display the calling method
		String method = joinPoint.getSignature().toShortString();
		logger.info("[+] @AfterReturning => Calling Method - " + method);
		
		// Display the data returned
		logger.info("[+] @AfterReturning => Result - " + result);
	}
}
