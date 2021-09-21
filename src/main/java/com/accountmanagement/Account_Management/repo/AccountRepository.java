package com.accountmanagement.Account_Management.repo;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.accountmanagement.Account_Management.entity.Account;



@Repository
public interface AccountRepository extends MongoRepository<Account, Integer> {

	// you can build custom queries here
	
}
