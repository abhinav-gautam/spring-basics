package com.abhinavgautam.springaop.pointcutdeclarations.dao;

import org.springframework.stereotype.Component;

import com.abhinavgautam.springaop.pointcutdeclarations.Account;

@Component
public class ManagementDAO {
	
	public void addAccount() {
		System.out.println("ManagementDAO: Add Account");
	}
	
	public boolean addManager() {
		System.out.println("ManagementDAO: Add Manager");
		return true;
	}
	
	public boolean addSpecialManager(Account account, boolean vip) {
		System.out.println("ManagementDAO: Add Special Manager");
		return vip;
	}
}
