package com.accountmanagement.Account_Management.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class LoginController {
	
	@GetMapping("/boom")
	public String helloWorld(Model model) {
		model.addAttribute("msg", "hello world");
		return "helloWorld";
	}
}
