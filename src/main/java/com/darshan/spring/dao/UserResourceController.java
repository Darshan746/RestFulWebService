package com.darshan.spring.dao;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.spring.exception.UserNotFoundException;

@RestController
public class UserResourceController {

	@Autowired
	UserServiceDAO service;
	
	@GetMapping(value="/users")
	public List<User> findAllUser(){
		
		return service.getAllUsers();
	}
	
	@GetMapping(value="/users/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		User user = service.findUser(id);
		if(user == null) {
			throw new UserNotFoundException("User not found");
		}
		return user;
	}
	
	@PostMapping(value="/users")
	public void addUser(@Valid @RequestBody User user) {
		service.addUser(user);
	}
}
