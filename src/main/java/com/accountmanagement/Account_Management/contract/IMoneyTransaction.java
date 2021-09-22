package com.accountmanagement.Account_Management.contract;

public interface IMoneyTransaction {
	
	public void transferMoney(String accNo1,String accNo2,double amtToTransfer);	

}
