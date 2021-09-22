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
	public CommandLineRunner commandLineRunner(CustomerRepository repo1,AccountRepository repo,TransactionRepo repo_trans) {
	

    //return string -> { 
    		
    	//repo.insert(new Account("5789461235","1023457315",25000));
    	//repo_trans.insert(new Transaction("54351","TX001","12/01/2021","1:00:00","debit","cash","1234567895","1023457315",2000.54));
	//};
	return null;
	}

}








