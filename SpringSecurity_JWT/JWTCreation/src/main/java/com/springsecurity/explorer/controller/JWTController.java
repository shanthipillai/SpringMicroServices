package com.springsecurity.explorer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTController {

@Autowired
JWTToken jtoken;
	@GetMapping("/validate/createtoken/{userId}")
	public String getJWTToken(@PathVariable String userId)
	{
		return jtoken.createToken(userId);
	}
	
	
	@GetMapping("/validate/tokenvalid/{userId}")
	public String validateToken(@RequestHeader String token, @PathVariable String userId )
	{
		return jtoken.validateToken(token, userId);
	}
	
	
}
