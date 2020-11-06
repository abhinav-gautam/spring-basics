package com.abhinavgautam.springaop.afterfinally.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {
	// Pointcut for every method in package
	@Pointcut("execution(* com.abhinavgautam.springaop.afterfinally.dao.*.*(..))")
	public void forDaoPackage() {
	}
}
