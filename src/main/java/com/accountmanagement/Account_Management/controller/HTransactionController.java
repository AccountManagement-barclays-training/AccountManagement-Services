package com.accountmanagement.Account_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accountmanagement.Account_Management.entity.Account;
import com.accountmanagement.Account_Management.entity.Customers;
import com.accountmanagement.Account_Management.services.*;

@RestController
public class HTransactionController {
	
	@Autowired
	private DepositService service;
	
	@Autowired
	private TransactionService tservice;
	
	@Autowired
	private CustomerService cservice;
	
	@Autowired
	private LoginService iservice;
	
	@GetMapping("/")
	public String Hello() {
		return "hello world";
	}
	
	@GetMapping("/deposit")
	public String deposit(
			@RequestParam("accno") String accno,
			@RequestParam("amt") double amt) {
		
		return service.deposit(accno, amt);
		
	}
	
	@GetMapping("/accno")
	public Account getAccInfo(
			@RequestParam("accno") String accno) {
		
		return service.getAccountInfo(accno);
		
	}
	
	@GetMapping("/withdraw")
	public String getAccInfo(
			@RequestParam("accno") String accno,
			@RequestParam("amt") double amt) {
		
		return service.withdraw(accno,amt);
		
	}
	
	@GetMapping("/moneyTransfer")
	public String deposit(
			@RequestParam("accno1") String accno1,
			@RequestParam("accno2") String accno2,
			@RequestParam("amt") double amt) {
		
		return tservice.transferMoney(accno1, accno2, amt);
		
	}
	
	@PostMapping("/customer")
	public String newCustomer(@RequestBody Customers c)
	{
		return cservice.insertCustomer(c);
	}
	
	@GetMapping("/customerLogin")
	public String customerLogin(@RequestParam("userid") int uid,
			@RequestParam("pwd") String pwd) {
		return iservice.customerLogin(uid, pwd);
	}

}