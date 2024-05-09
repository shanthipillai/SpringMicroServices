package com.training.springbootwebconcepts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserManagementController {
@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView sayWelcomeToUser()
	{
	String msg="Welcome to JSP PAge Dynamically"	;
	ModelAndView mv=new ModelAndView();
	mv.setViewName("wish");
	mv.addObject("message",msg);
	return mv;
		
	}

@RequestMapping(value="/welcome", method=RequestMethod.GET)
public String welcomePage()
{
	return "welcome";
}
}
