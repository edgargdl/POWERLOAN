package com.example.demo2;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.model.UserResponse;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@RestController
@RequestMapping("/Users")
@CrossOrigin

public class Controller {
	
	@Autowired
	UsersService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public HttpEntity<User> createUser(@RequestBody User input)
	{
		
		User usres = service.createUser(input);
		usres.add(linkTo(methodOn(Controller.class).createUser(input)).withSelfRel());
		usres.add(linkTo(methodOn(Controller.class).getUser(input)).withRel("getUser"));
		
		return new ResponseEntity<User>(usres,HttpStatus.OK);
	
		
	}
	
	@RequestMapping("/{username}")
	public UserResponse getUser(@RequestBody User user)
			
	{
		return service.isAuthenticated(user);
		
	}
}
