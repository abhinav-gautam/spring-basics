package com.abhinavgautam.springaop.afterreturn;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhinavgautam.springaop.afterreturn.dao.AccountDAO;

public class MainApp {

	public static void main(String[] args) {
		// Read the spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// Get the bean from the spring container
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		List<Account> accounts = accountDAO.findAccount();
		
		System.out.println("MainApp => findAccount - "+accounts);
		// Close the context
		context.close();
	}
}
