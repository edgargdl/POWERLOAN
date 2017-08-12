package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Application;

public interface ApplicationRepository extends MongoRepository<Application, String> {


}