package com.example.demo2;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.model.ResponseStatus;
import com.example.model.User;
import com.example.model.UserResponse;

@Service
public class UsersService {

	@Autowired
	private UserRepository repository;

	Hashtable<String, User> userDatabase = new Hashtable<String, User>();

	public User createUser(User user) {

		if (repository.findByUsername(user.getUsername()) == null) {
			repository.save(user);

			return user;
		}

		else {
		
			return null;
		}

	};
	public HttpEntity<User> isAuthenticated(User userParm) {

		UserResponse response = new UserResponse();
		User user = repository.findByUsername(userParm.getUsername());
		String password = userParm.getPassword();
		if (user != null) {
			if (password.equals(user.getPassword())) {
				
				user.add(linkTo(methodOn(Controller.class).getUser(user)).withSelfRel());
				user.add(linkTo(methodOn(Controller.class).createUser(user)).withRel("createUser"));
				return new ResponseEntity<User>(user,HttpStatus.OK);
				
			} else {
				return new ResponseEntity<User>(user,HttpStatus.UNAUTHORIZED);
			}
		} else {
			return new ResponseEntity<User>(user,HttpStatus.UNAUTHORIZED);
		}

	}
}
