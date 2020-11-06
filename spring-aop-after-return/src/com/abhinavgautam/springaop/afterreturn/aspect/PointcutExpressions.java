package com.abhinavgautam.springaop.afterreturn.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {
	// Pointcut for every method in package
	@Pointcut("execution(* com.abhinavgautam.springaop.afterreturn.dao.*.*(..))")
	public void forDaoPackage() {
	}
}
