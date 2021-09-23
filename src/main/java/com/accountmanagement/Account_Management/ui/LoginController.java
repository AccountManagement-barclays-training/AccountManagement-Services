package com.accountmanagement.Account_Management.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.accountmanagement.Account_Management.services.DepositService;

import org.springframework.ui.Model;

@Controller
public class LoginController {
	
	@Autowired
	private DepositService service;
	
	@GetMapping("/customerlogin")
	public String customerlogin(Model model) {
		model.addAttribute("msg", "hello world");
		return "customerlogin";
	}
	
	@GetMapping("/managerlogin")
	public String managerlogin(Model model) {
		model.addAttribute("msg", "hello world");
		return "managerlogin";
	}
	
	@GetMapping("/displayAccounts")
	public String displayAccounts(Model model) {
		model.addAttribute("msg", "hello world");
		return "displayAccounts";
	}
	
	@GetMapping("/newCustomer")
	public String newCustomer(Model model) {
		model.addAttribute("msg", "hello world");
		return "newCustomer";
	}
	
	@GetMapping("/accountTransfer")
	public String transfer(Model model) {
		model.addAttribute("msg", "hello world");
		return "accountTransfer";
	}
	
	@GetMapping("/cashOperations")
	public String ops(Model model) {
		model.addAttribute("msg", "hello world");
		return "cashOperations";
	}
	@GetMapping("/cashdeposit")
	public String cashDeposit(Model model) {
		model.addAttribute("msg", "hello world");
		return "deposit";
	}
	@GetMapping("/cashwithdrawal")
	public String cashWithdrawal(Model model) {
		model.addAttribute("msg", "hello world");
		return "withdraw";
	}
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg", "hello world");
		return "welcome";
	}
	
	@GetMapping("/findAccno")
	public String findAccno(@RequestParam("accno") String accno,Model model) {
		model.addAttribute("products", service.getAccountInfo(accno));
		return "AccountDetails";
	}
	@GetMapping("/findAllAccno")
	public String findAllAccno(Model model) {
		model.addAttribute("products", service.getAllAccounts());
		return "AccountDetails";
	}
	
	
}
