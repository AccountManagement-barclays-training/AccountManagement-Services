package com.accountmanagement.Account_Management.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.accountmanagement.Account_Management.entity.Users;

@Repository
public interface UsersRepo extends MongoRepository<Users, Integer> {

	@Query
	(value = "{'userid':?0}")
//	String custLogin(int userid);
	Users custLogin(int userid);
}	