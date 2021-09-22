package com.accountmanagement.Account_Management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountmanagement.Account_Management.contract.IDepositService;
import com.accountmanagement.Account_Management.contract.IMoneyTransaction;
import com.accountmanagement.Account_Management.entity.Account;
import com.accountmanagement.Account_Management.repo.AccountRepository;


@Service
public class DepositService implements IDepositService{

	@Autowired
	private AccountRepository repo;
	
	@Override
	public String deposit(String accno, double amt) {
		try{
			Account account=repo.getAccount(accno);
			double bal=account.getBalance();
			account.setBalance(bal+amt);
			repo.save(account);
			return "Updated successfully";
		}
		catch(Exception e) {
			System.out.println("Error in Deposit Service class\n: "+e.getMessage());
			
			return "Error";
		}								
		
	}

	@Override
	public Account getAccountInfo(String accno) {
		try {
			Account account=repo.getAccount(accno);
			return account;
		}
		catch(Exception e) {
			System.out.println("Error in Deposit Service class\n: "+e.getMessage());
			
			return null;
		}
	}

}
