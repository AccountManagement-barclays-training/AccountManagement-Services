package com.accountmanagement.Account_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.accountmanagement.Account_Management.contract.IService;

import com.accountmanagement.Account_Management.contract.IAccountService;
import com.accountmanagement.Account_Management.entity.Account;
import com.accountmanagement.Account_Management.entity.Transaction;




@RestController
public class Controller {
	
private IService service; 

	
	@GetMapping("/")
	public String Hello() {
		return "hello world";
	}
	
	@GetMapping("/login")
	public String customerLogin(@RequestParam("userid") int userid, @RequestParam("pwd") String pwd) {		
		return service.customerLogin(userid, pwd);
	}
	
	/*@PostMapping("/cashdeposit")
	public String cashDeposit(@RequestBody Transaction t) {
		return service.cashDeposit(t);
	}*/
	
	@GetMapping("/cashdeposit")
	public String cashDeposit(@RequestParam("cid") String cid,@RequestParam("amt") double amt) {
		return service.cashDeposit(cid,amt);
	}
	
	@PostMapping("/customer")
	public String insertCustomer(@RequestParam("cid") String cid,@RequestParam("panNum") String panNum,@RequestParam("aadharNum") String aadharNum,@RequestParam("custName") String custName, @RequestParam("custAddress") String custAddress,
			@RequestParam("custEmail") String custEmail,@RequestParam("custDOB") String custDOB) {
		return service.insertCustomer(cid,panNum,aadharNum,custName,custAddress,custEmail,custDOB);
	}
}
