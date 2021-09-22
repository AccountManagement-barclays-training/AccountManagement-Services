package com.accountmanagement.Account_Management.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.accountmanagement.Account_Management.contract.IMoneyTransaction;
import com.accountmanagement.Account_Management.repo.*;

public class TransactionService implements IMoneyTransaction {
	
	@Autowired
	private CustomerRepository repo;
	
	@Autowired
	private AccountRepository accRepo;

	@Override
	public void transferMoney(String accNo1, String accNo2, double amtToTransfer) {
		//deosit
		//withdraw
		
	}
	
	

}
