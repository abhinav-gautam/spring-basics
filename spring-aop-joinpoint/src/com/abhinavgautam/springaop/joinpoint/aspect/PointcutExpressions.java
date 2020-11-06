package com.abhinavgautam.springaop.joinpoint.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {
	// Pointcut for every method in package
	@Pointcut("execution(* com.abhinavgautam.springaop.joinpoint.dao.*.*(..))")
	public void forDaoPackage() {
	}

	// Pointcut for getter method
	@Pointcut("execution(* com.abhinavgautam.springaop.joinpoint.dao.*.get*(..))")
	public void getter() {
	}

	// Pointcut for setter method
	@Pointcut("execution(* com.abhinavgautam.springaop.joinpoint.dao.*.set*(..))")
	public void setter() {
	}

	// Pointcut for dao package but no getter setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void packageNoGetterSetter() {
	}
}
