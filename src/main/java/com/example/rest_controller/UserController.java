package com.example.rest_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/")
	public User findByUserId() {
		return null;
	}
	
	
}
