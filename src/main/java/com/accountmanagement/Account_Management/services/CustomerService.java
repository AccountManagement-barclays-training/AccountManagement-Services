package com.accountmanagement.Account_Management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountmanagement.Account_Management.contract.IAccountService;
import com.accountmanagement.Account_Management.entity.Customers;
import com.accountmanagement.Account_Management.repo.AccountRepository;
import com.accountmanagement.Account_Management.repo.CustomerRepository;

@Service
public class CustomerService implements IAccountService{
	@Autowired
	private CustomerRepository cust_repo;
	
	@Override
	public String insertCustomer(Customers c) {

		cust_repo.save(c);
		return "Insertion Successful";
	}
}
