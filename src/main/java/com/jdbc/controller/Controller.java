package com.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.entity.User;
import com.jdbc.repository.Repository;

@RestController
public class Controller {

	@Autowired
	Repository repo;
	
	@RequestMapping("/get")
	public String getMsg()
	{
		return "Message is getting...";
	}
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user)
	{
	    return repo.save(user);
	}
}
