package com.accountmanagement.Account_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accountmanagement.Account_Management.entity.Transaction;
import com.accountmanagement.Account_Management.repo.AccountRepository;
import com.accountmanagement.Account_Management.repo.TransactionRepo;
import com.accountmanagement.Account_Management.service.CustomerService;

import com.accountmanagement.Account_Management.contract.*;
import org.springframework.*;

@RestController
public class Controller {
	@Autowired
	private CustomerService service;
	@GetMapping("/")
	public String hello() {
		return "Hello world";
	}
//	@GetMapping("/withdrawal")
	//public String cashwithdrawal(@RequestParam("cid") String cid,@RequestParam("amt") double amt)
	//{
		//return service.cashwithdrawal(cid,amt);
	//}
	
	
}
