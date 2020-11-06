package com.abhinavgautam.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	// This runs for any class addAccount method with no parameter
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("Advice => Before Add Account Advice");
	}

	// This runs only for ManagementDAO addAccount method with no parameter
	@Before("execution(public void com.abhinavgautam.springaop.dao.ManagementDAO.addAccount())")
	public void beforeManagementAddAccountAdvice() {
		System.out.println("Advice => Before Management Add Account Advice");
	}

	// This runs for any class any method starting with add and no parameter
	@Before("execution(public void add*())")
	public void beforeAddAdvice() {
		System.out.println("Advice => Before Add Method Advice");
	}

	// This runs for any class any method starting with add and return type boolean.
	// Also no parameter
	@Before("execution(public boolean add*())")
	public void beforeAddAdviceBooleanType() {
		System.out.println("Advice => Before Add Method Advice. Boolean Return Type.");
	}

	// Any return type, any method starting with add, parameter Account
	@Before("execution(* add*(com.abhinavgautam.springaop.Account))")
	public void beforeAddParameterAccount() {
		System.out.println("Advice => Before Add Method Advice. Parameter Account.");
	}

	// Any return type, any method starting with add, parameter Account plus other
	// parameters
	@Before("execution(* add*(com.abhinavgautam.springaop.Account,..))")
	public void beforeAddParameterAccountPlusOther() {
		System.out.println("Advice => Before Add Method Advice. Parameter Account Plus Other.");
	}

	// Any return type, any parameter, any method under package com.abhinavgautam.springaop.dao
	// parameters
	@Before("execution(* com.abhinavgautam.springaop.dao.*.*(..))")
	public void beforeAnyMethodUnderPackage() {
		System.out.println("Advice => Before Any Method Under Package DAO.");
	}

}
