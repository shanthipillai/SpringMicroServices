package com.training.springbootwebconcepts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springbootwebconcepts.dto.UserManagementDTO;
//@Controller

@RestController //=Controller+ResonseBody
public class UserManagementService {
@RequestMapping(value="/info", method=RequestMethod.GET)
//@ResponseBody
	public UserManagementDTO sayHell()
	{
	   UserManagementDTO dto=UserManagementDTO.builder().id("75").email("test@gmail.com").name("Shanthi").build();
	 
		return dto;
	}

@RequestMapping(value="/users", method=RequestMethod.POST)
//@ResponseBody
	public UserManagementDTO userDetails()
	{
	   UserManagementDTO dto=UserManagementDTO.builder().id("75").email("test@gmail.com").name("Shanthi").build();
	 
		return dto;
	}




	
}
