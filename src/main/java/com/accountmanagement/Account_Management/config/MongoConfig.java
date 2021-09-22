package com.accountmanagement.Account_Management.config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.accountmanagement.Account_Management.entity.*;
import com.accountmanagement.Account_Management.repo.*;

@Configuration
@EnableMongoRepositories(basePackageClasses = {CustomerRepository.class,TransactionRepo.class,AccountRepository.class, UsersRepo.class})
public class MongoConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository repo,TransactionRepo repo_trans,AccountRepository repo_acnt, UsersRepo userrepo) {
	

//    return string -> { 
//    	userrepo.insert(new Users(110,"abcd","customer"));
//    	};	
		
	return null;
	}

}








