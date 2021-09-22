package com.accountmanagement.Account_Management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import com.accountmanagement.Account_Management.contract.*;
import com.accountmanagement.Account_Management.repo.AccountRepository;
import com.accountmanagement.Account_Management.repo.TransactionRepo;
import com.accountmanagement.Account_Management.entity.*;
@Service
public class CustomerService  implements IEmployeeService{
	@Autowired
	private AccountRepository repo;
	//@Autowired
	//private TransactionRepo repo1;
	
	
	@Override
	public String cashwithdrawal(String cid,double amt)
	{
		//repo1.save(t);
		//repo.updatebalance(t.getBalance(),t.getCid(),t.getAccno());
		//Account act=repo.getBalance(cid);
		Account act=repo.getBalance(cid);
		try {
		
		act.setBalance(act.getBalance()-amt);
		repo.save(act);
		}
		catch(Exception e)
		{
			System.out.print("error");
		}
			
		if(act!=null)
			return "Updated the Transaction";
		else
			return null;
		
	}
}
