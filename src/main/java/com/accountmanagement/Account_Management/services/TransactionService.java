package com.accountmanagement.Account_Management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountmanagement.Account_Management.contract.IMoneyTransaction;
import com.accountmanagement.Account_Management.entity.Account;
import com.accountmanagement.Account_Management.repo.*;

@Service
public class TransactionService implements IMoneyTransaction {	
	
	@Autowired
	private DepositService service;

	@Override
	public String transferMoney(String accno1, String accno2, double amt) {
		//deosit
		//withdraw
		String msg=service.withdraw(accno1, amt);
		if(msg=="Withdrawal successfull")
		{
			String msg2=service.deposit(accno2, amt);
			if(msg2!="Error")
			{
				return "Money transferred from Account: "+accno1+" to Account: "+accno2;
			}
			else {
				service.deposit(accno1, amt);
				return "Account: "+accno2+" does not exist";
			}
		}
		else {
			return "Insufficient Balance in Account: "+accno1;
		}
		
		
		
	}
	
	

}
