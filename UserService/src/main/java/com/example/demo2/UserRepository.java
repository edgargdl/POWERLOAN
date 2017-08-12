package com.example.demo2;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.User;


public interface UserRepository extends MongoRepository<User, String> {

	 public User findByUsername(String username);
	 

}