package com.accountmanagement.Account_Management.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.accountmanagement.Account_Management.entity.Account;



@Repository
public interface AccountRepository extends MongoRepository<Account, Integer> {

	// you can build custom queries here
/* @Query("{cid: ?1, accno: ?2}")
 Account getBalance(String cid,String accno);*/
 

	@Query(value="{cid:?0}")
	Account getBalance(String cid);
	

}
