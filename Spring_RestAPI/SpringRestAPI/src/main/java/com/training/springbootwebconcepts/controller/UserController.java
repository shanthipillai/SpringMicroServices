package com.training.springbootwebconcepts.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springbootwebconcepts.dto.MoreDtoManipulations;
import com.training.springbootwebconcepts.dto.MoreDtoManipulations2;
import com.training.springbootwebconcepts.dto.UserReqisterDto;
import com.training.springbootwebconcepts.dto.UserReqisterDto2;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("/register")
	public UserReqisterDto registerUser(@RequestBody  UserReqisterDto request)
	{
		
		return request;
	}
	
	
	@PostMapping("/register/more")
	public List<UserReqisterDto2> registerUser2(@RequestBody List<UserReqisterDto2> users)
	{
		
	   // users.forEach(System.out::println);
		return users;
	}
	
	

	@PostMapping("/register/getmorelist")
	public MoreDtoManipulations registerUser3(@RequestBody MoreDtoManipulations list)
	{
		list.getUserslist().stream().forEach(u->System.out.println(u.getFirstName()+""+u.getEmail()+""+u.getCity()+u.getGender()));
	   list.getUseraddr().stream().forEach(a->System.out.println(a.getCity()+""+a.getCountry()+""+a.getPincode()));
		// users.forEach(System.out::println);
	//	return "More Users Added";
	    return list;
	}
	
	
	@PostMapping("/register/getmorelistinnerarray")
	public MoreDtoManipulations2 registerUser4(@RequestBody MoreDtoManipulations2 list)
	{
		//list.getUserslist().stream().forEach(u->System.out.println(u.getFirstName()+""+u.getEmail()+""+u.getCity()+u.getGender()));
	  // list.getUseraddr().stream().forEach(a->System.out.println(a.getCity()+""+a.getCountry()+""+a.getPincode()));
		// users.forEach(System.out::println);
	//	return "More Users Added";
	    return list;
	}
	
	
	
	@PostMapping("/load")
	public UserReqisterDto loadData( UserReqisterDto request)
	{
		return request;
	}
}
