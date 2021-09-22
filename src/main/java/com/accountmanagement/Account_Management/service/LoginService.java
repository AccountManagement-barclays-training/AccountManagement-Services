package com.accountmanagement.Account_Management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountmanagement.Account_Management.contract.IService;
import com.accountmanagement.Account_Management.entity.Users;
import com.accountmanagement.Account_Management.repo.UsersRepo;

@Service
public class LoginService implements IService {
	
	@Autowired
	private UsersRepo userRepo;

	@Override
	public String customerLogin(int userid, String pwd) {
		Users u = userRepo.custLogin(userid);
		try {
		if(! u.getPwd().equals(pwd))
			return "Incorrect password";
		else
			return "Login successful";
		
		}
		
		catch(NullPointerException e) {return "No such user";}

}

}
