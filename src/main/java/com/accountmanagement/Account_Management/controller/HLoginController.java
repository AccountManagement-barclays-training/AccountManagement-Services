package com.accountmanagement.Account_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accountmanagement.Account_Management.entity.Account;
import com.accountmanagement.Account_Management.services.DepositService;

@RestController
public class HLoginController {
	
	@Autowired
	private DepositService service;
	
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
	
	

}