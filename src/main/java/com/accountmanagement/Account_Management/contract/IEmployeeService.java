package com.accountmanagement.Account_Management.contract;

import org.springframework.web.bind.annotation.RequestBody;

import com.accountmanagement.Account_Management.entity.*;

public interface IEmployeeService {
	public String cashwithdrawal(String cid,double amt);
	
}
