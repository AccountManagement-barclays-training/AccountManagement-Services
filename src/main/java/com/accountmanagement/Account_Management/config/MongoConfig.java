package com.accountmanagement.Account_Management.config;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.accountmanagement.Account_Management.entity.*;
import com.accountmanagement.Account_Management.repo.*;

@Configuration
@EnableMongoRepositories(basePackageClasses = {CustomerRepository.class,TransactionRepo.class,AccountRepository.class})
public class MongoConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository repo,TransactionRepo repo_trans,AccountRepository repo_acnt) {
	

   /* return string -> { 
    	//repo.insert(new Customers(156789,"ABCDE34521",1944023411,"Abinaya","Chennai","abcde123@gmail.com","12/07/2000"));
    	//repo_trans.insert(new Transaction("54321", "TX001", "12/01/2021", "1:00:00", "debit", "cash", "1234568790",
		//	"1023455321", 20000.54));
    	repo_acnt.insert(new Account("102","1232",20000.00));
    	};*/	
		
	return null;
	}
	
	

}








