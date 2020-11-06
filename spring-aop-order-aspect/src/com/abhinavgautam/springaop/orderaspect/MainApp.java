package com.abhinavgautam.springaop.orderaspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhinavgautam.springaop.orderaspect.dao.AccountDAO;
import com.abhinavgautam.springaop.orderaspect.dao.ManagementDAO;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Read the spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// Get the bean from the spring container
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		ManagementDAO managementDAO= context.getBean("managementDAO",ManagementDAO.class);
		
		// Call the business method
		accountDAO.addAccount();
		accountDAO.addDepartment();
		accountDAO.setName("Bond");
		accountDAO.getName();
		accountDAO.addSpecialAccount(new Account("John Wick"));
		
		managementDAO.addAccount();
		managementDAO.addManager();
		managementDAO.addSpecialManager(new Account("James Bond"), true);
		
		// Close the context
		context.close();
	}
}
