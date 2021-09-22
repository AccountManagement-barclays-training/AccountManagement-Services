package com.accountmanagement.Account_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.accountmanagement.Account_Management.contract.IService;

@RestController
public class Controller {
	
	@Autowired
	private IService service; 
	
	@GetMapping("/")
	public String Hello() {
		return "hello world";
	}
	
	@GetMapping("/login")
	public String customerLogin(@RequestParam("userid") int userid, @RequestParam("pwd") String pwd) {		
		return service.customerLogin(userid, pwd);
	}

}
