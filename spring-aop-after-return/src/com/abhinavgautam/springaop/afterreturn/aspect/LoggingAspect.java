package com.abhinavgautam.springaop.afterreturn.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.abhinavgautam.springaop.afterreturn.Account;

@Aspect
@Component
public class LoggingAspect {

	@Before("com.abhinavgautam.springaop.afterreturn.aspect.PointcutExpressions.forDaoPackage()")
	public void logToConsole(JoinPoint joinPoint) {
		System.out.println("Advice => Logging to console.");

		// Getting method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Logging Aspect => Method Signature - " + methodSignature);

		// Getting args
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			System.out.println("Logging Aspect => Argument - " + arg);
			if (arg instanceof Account) {
				Account account = (Account) arg;
				System.out.println("Logging Aspect => Account name - " + account.getName());
			}
		}
	}

	@AfterReturning(
			pointcut = "execution(* com.abhinavgautam.springaop.afterreturn.dao.AccountDAO.findAccount(..))",
			returning = "result")
	public void afterReturnFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		// Print the method we are advising on
		String method = joinPoint.getSignature().toShortString();
		System.out.println("After Return Advice => Method - "+method);
		
		// Print out the results of the method call 
		System.out.println("After Return Advice => Return - "+result);
		
		// Modify the return data
		if(result!=null) {
			Account acc = result.get(0);
			acc.setName(acc.getName().toUpperCase());
		}
	}

}
