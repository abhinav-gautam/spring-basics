package com.abhinavgautam.springaop.orderaspect.dao;

import org.springframework.stereotype.Component;

import com.abhinavgautam.springaop.orderaspect.Account;

@Component
public class AccountDAO {
	
	private String name;
	
	public String getName() {
		System.out.println("AccountDAO: Getter");
		return name;
	}

	public void setName(String name) {
		System.out.println("AccountDAO: Setter");
		this.name = name;
	}

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
