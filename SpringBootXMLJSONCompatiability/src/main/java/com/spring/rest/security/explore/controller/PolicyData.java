package com.spring.rest.security.explore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.security.explore.entity.Policy;
import com.spring.rest.security.explore.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyData {

	@Autowired
	PolicyService service;
	
	@GetMapping("/allpolicydetails")
	public List<Policy> getData()
	{
		return service.getData();
		
	}
	
	@PostMapping("/savedata")
	public void savePolicy(@RequestBody Policy policy)
	{
		service.savePolicy(policy);
	}
	
	
	@PostMapping(value="/savedataV2", consumes=MediaType.APPLICATION_PROBLEM_JSON_VALUE)
	public void savePolicyV2(@RequestBody Policy policy)
	{
		service.savePolicy(policy);
	}
	
	@PostMapping(value="/savedataV3", consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void savePolicyV3(@RequestBody Policy policy)
	{
		service.savePolicy(policy);
	}
}
