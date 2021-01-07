package com.registration.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.registration.models.RegistrationDetailsModel;
import com.registration.service.UserRegistrationServiceImpl;

@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "*")
public class RegistrationController {
	
	@Autowired
	private UserRegistrationServiceImpl userService;

	@PostMapping("/user")
	public String registerUser(@Valid @RequestBody RegistrationDetailsModel register) {
		System.out.println(register);
		userService.CreateUser(register);
		return ("User is created");
	}
}
