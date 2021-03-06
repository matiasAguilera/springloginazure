package com.login.test.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	@PreAuthorize("hasRole('Users')")
	@RequestMapping("/")
	public String hellowWorld() {
		return "helow world!!";
	}
}
