package com.accountmanagement.Account_Management.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Transaction {

	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String tid="";
	String trn="",date="",time="",type="",subType="",accno="",cid="";
	double balance=0.0;
	
	
	public Transaction(String tid, String trn, String date, String time, String type, String subType, String accno,
			String cid, double balance) {
		super();
		this.tid = tid;
		this.trn = trn;
		this.date = date;
		this.time = time;
		this.type = type;
		this.subType = subType;
		this.accno = accno;
		this.cid = cid;
		this.balance = balance;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTrn() {
		return trn;
	}
	public void setTrn(String trn) {
		this.trn = trn;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
