package com.accountmanagement.Account_Management.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.accountmanagement.Account_Management.entity.Transaction;

@Repository
public interface TransactionRepo extends MongoRepository<Transaction, Integer> {

	// you can build custom queries here
	
}
