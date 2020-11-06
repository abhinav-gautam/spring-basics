package com.abhinavgautam.springaop.afterthrowing.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.abhinavgautam.springaop.afterthrowing.Account;

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
	
	public List<Account> findAccount(boolean throwException){
		if(throwException) {
			throw new RuntimeException("Exception in findAccount");
		}
		
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("John Wick"));
		accounts.add(new Account("James Bond"));
		accounts.add(new Account("Andrew Garfield"));
		return accounts;		
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
