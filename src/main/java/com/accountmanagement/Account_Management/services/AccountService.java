package com.accountmanagement.Account_Management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountmanagement.Account_Management.contract.IAccountService;
import com.accountmanagement.Account_Management.entity.*;
import com.accountmanagement.Account_Management.repo.*;

@Service
public class AccountService implements IAccountService{
	@Autowired
	private TransactionRepo repo;
	
	@Autowired
	private AccountRepository acc_repo;
	private CustomerRepository cust_repo;
	
	@Override
	public String cashDeposit(String cid,double amt)
	{
		//repo.save(t);
		//Account acnt=acc_repo.getBalance(t.getCid(),t.getAccno());
		//acnt.setBalance(acnt.getBalance()+t.getBalance());
		//acc_repo.save(acnt);
		//acc_repo.
		try {
		Account acnt=acc_repo.getBalance(cid);
		double bal=acnt.getBalance();
		acnt.setBalance(bal+amt);
		acc_repo.save(acnt);
		
		return "Updated the transaction";}
		catch(Exception e) {
			System.out.println("Error in Deposit Service class\n: "+e.getMessage());
			
			return "Error";
		}
		
	}
	
	@Override
	public String insertCustomer(String custID, String panNum, String aadharNum, String custName, String custAddress,String custEmail, String custDOB)
	{
		//cust_repo.save
		return null;
	}
	

}
