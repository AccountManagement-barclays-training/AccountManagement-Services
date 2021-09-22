package com.accountmanagement.Account_Management;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accountmanagement.Account_Management.*;
@RestController
public class SendEmailController {
@Autowired
AccountManagementApplication sendingemailapplication;

@RequestMapping(value="/sendemail")
public String send() throws AddressException,MessagingException,IOException
{
	sendingemailapplication.sendEmail();
	return "Email sent successfully";
}
}
