package com.accountmanagement.Account_Management.contract;

import java.util.List;

import com.accountmanagement.Account_Management.entity.Account;

public interface IDepositService {
	public String deposit(String accno,double amt);
	public Account getAccountInfo(String accno);
	public List<Account> getAllAccounts();
	public String withdraw(String accno,double amt);
	
}
