package com.abhinavgautam.springaop.afterthrowing.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {
	// Pointcut for every method in package
	@Pointcut("execution(* com.abhinavgautam.springaop.afterthrowing.dao.*.*(..))")
	public void forDaoPackage() {
	}
}
