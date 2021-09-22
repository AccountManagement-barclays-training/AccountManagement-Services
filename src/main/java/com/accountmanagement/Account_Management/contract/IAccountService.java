package com.accountmanagement.Account_Management.contract;

import java.util.List;

import com.accountmanagement.Account_Management.entity.*;
public interface IAccountService {
	public String cashDeposit(String cid,double amt);
	public String insertCustomer(String custID, String panNum, String aadharNum, String custName, String custAddress,
			String custEmail, String custDOB);

}
