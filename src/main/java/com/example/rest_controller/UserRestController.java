package com.example.rest_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;

/**
 * ユーザ登録を行うAPI.
 * 
 * @author yosuke.yamada
 *
 */
@RestController
@RequestMapping("/user")
public class UserRestController {

	@GetMapping("/")
	public User findByUserId() {
		return null;
	}
	
	@PostMapping("/")
	public User registerUser() {
		return null;
	}
	
	@PutMapping("/")
	public User updateUser() {
		return null;
	}
	
	
}
