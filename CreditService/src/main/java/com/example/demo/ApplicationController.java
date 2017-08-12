package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Application;
import com.example.demo.model.ApplicationCreationResponse;



@RequestMapping("/Applications")
@RestController
@CrossOrigin
public class ApplicationController {

	
	@Autowired
	ApplicationService service;
	@RequestMapping(method = RequestMethod.POST)
	
	public ApplicationCreationResponse createUser(@RequestBody Application input)
	{
		return service.runCredit(input);
	}
	
	
}
