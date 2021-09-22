package com.accountmanagement.Account_Management.contract;
import com.accountmanagement.Account_Management.entity.*;

public interface IMoneyTransaction {
	
	public String transferMoney(String accNo1,String accNo2,double amtToTransfer);	

}
