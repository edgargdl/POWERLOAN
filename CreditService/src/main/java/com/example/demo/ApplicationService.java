package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Application;
import com.example.demo.model.ApplicationCreationResponse;
import com.example.demo.model.ResponseStatus;


@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository repository;
	
	
	public void createApplication(Application app)
	{
		
		runCredit( app);		
	};
	
	public ApplicationCreationResponse runCredit(Application app)
	{
		ApplicationCreationResponse response = new ApplicationCreationResponse();
		
		//ALWAYS APPROVED NOW
		app.setApplicationStatus(ResponseStatus.APPROVED);
		response.setApp(app);
		repository.save(app);
		return response;
		
	}
	
}
