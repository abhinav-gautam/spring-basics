package com.abhinavgautam.springaop.pointcutdeclarations.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	// Pointcut for every method in package
	@Pointcut("execution(* com.abhinavgautam.springaop.pointcutdeclarations.dao.*.*(..))")
	public void forDaoPackage() {
	}

	// Any return type, any parameter, any method under package
	// com.abhinavgautam.springaop.dao
	// parameters
	@Before("forDaoPackage()")
	public void beforeAnyMethodUnderPackage() {
		System.out.println("Advice => Before Any Method Under Package DAO.");
	}

	// Reusing point-cut expressions
	@Before("forDaoPackage()")
	public void performingApiAnalytics() {
		System.out.println("Advice => Performing api analytics");
	}

	// Pointcut for getter method
	@Pointcut("execution(* com.abhinavgautam.springaop.pointcutdeclarations.dao.*.get*(..))")
	public void getter() {
	}

	// Pointcut for setter method
	@Pointcut("execution(* com.abhinavgautam.springaop.pointcutdeclarations.dao.*.set*(..))")
	public void setter() {
	}
	
	// Pointcut for dao package but no getter setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void packageNoGetterSetter() {}
	
	@Before("packageNoGetterSetter()")
	public void packageNoGetterSetterBeforeAdvice() {
		System.out.println("Advice => Only for main functions");
	}
}
