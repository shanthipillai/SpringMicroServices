package com.training.springbootwebconcepts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	
	@RequestMapping(path ="/hello", method=RequestMethod.GET )
	
	@ResponseBody
	public String printPageWelcome()
	{
		//Login:Service->Repo
		return "Welcome to Spring Boot-MVC_WEB Module";
		
	}
	
	
	

	@RequestMapping(path ="/course", method=RequestMethod.GET)
	
	@ResponseBody
	public String courceContent()
	{
		//Login:Service->Repo
		return "<html><h1><font color='green'>Will direct to course content</h1></html>";
		
	}
}
