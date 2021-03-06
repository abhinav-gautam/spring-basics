package com.abhinavgautam.springaop.afterthrowing;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhinavgautam.springaop.afterthrowing.dao.AccountDAO;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Read the spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// Get the bean from the spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

		List<Account> accounts = null;
		try {
			accounts = accountDAO.findAccount(true);
		} catch (Exception e) {
			System.out.println("MainApp => Exception - " + e);
		}
		System.out.println("MainApp => findAccount - " + accounts);
		// Close the context
		context.close();
	}
}
