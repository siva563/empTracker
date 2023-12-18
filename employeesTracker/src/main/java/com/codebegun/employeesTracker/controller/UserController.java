package com.codebegun.employeesTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.codebegun.employeesTracker.model.User;
import com.codebegun.employeesTracker.repository.UserRepository;

@RestController
@CrossOrigin

public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/addUser")

	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}

	@GetMapping("/getUsers")
	List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
