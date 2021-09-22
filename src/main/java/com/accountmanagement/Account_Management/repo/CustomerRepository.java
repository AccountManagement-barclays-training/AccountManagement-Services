package com.accountmanagement.Account_Management.repo;


import java.util.List;
import com.accountmanagement.Account_Management.entity.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends MongoRepository<Customers, Integer> {

	// you can build custom queries here
	
}

