package com.abhinavgautam.springaop.dao;

import org.springframework.stereotype.Component;

import com.abhinavgautam.springaop.Account;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println("AccountDAO: Add Account");
	}
	
	public void addDepartment() {
		System.out.println("AccountDAO: Add Department");
	}
	
	public void addSpecialAccount(Account account) {
		System.out.println("AccountDAO: Add Special Account");
	}
}
