package com.training.springbootwebconcepts.controller;

import org.apache.catalina.WebResourceRoot.ResourceSetType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondController {

	@RequestMapping(path ="/add/user", method=RequestMethod.POST )
@ResponseBody
public String addUser()
{
	return "User Added";
	
}
}
