package com.example.demo2;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ResourceSupport;
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

	
	public UserResponse isAuthenticated(User userParm) {

		UserResponse response = new UserResponse();
		User user = repository.findByUsername(userParm.getUsername());
		String password = userParm.getPassword();
		if (user != null) {
			if (password.equals(user.getPassword())) {
				response.setStatus(ResponseStatus.AUTHENTICATED);
				response.setUser(user);
				return response;
			} else {
				response.setStatus(ResponseStatus.WRONG_PASSWORD);
				response.setUser(null);
				return response;
			}
		} else {
			response.setStatus(ResponseStatus.USER_NOT_EXIST);
			response.setUser(null);
			return response;
		}

	}

}
