package com.accountmanagement.Account_Management.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
	@Id
	int userid;
	String pwd = " ",role;
	
	Users(){
		
	}
	public Users(int userid, String pwd, String role)
	{
		this.userid = userid;
		this.pwd = pwd;
		this.role = role;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int uid) {
		this.userid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
