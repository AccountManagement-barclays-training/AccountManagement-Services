package com.accountmanagement.Account_Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


@SpringBootApplication
public class AccountManagementApplication {
	@Autowired
	private JavaMailSender javamailsender;
	
	public static void main(String[] args) {
		SpringApplication.run(AccountManagementApplication.class, args);
	}
	
	public void sendEmail()
	{
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("sharrikvk18@gmail.com");
		msg.setSubject("Test Mail");
		msg.setText("Testing..");
		javamailsender.send(msg);

	}

}
