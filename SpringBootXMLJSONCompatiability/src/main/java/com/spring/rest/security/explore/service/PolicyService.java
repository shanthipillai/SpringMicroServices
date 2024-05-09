package com.spring.rest.security.explore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.security.explore.entity.Policy;
import com.spring.rest.security.explore.repository.PolicyRepo;

@Service
public class PolicyService {
	@Autowired
	PolicyRepo repo;
	
	public List<Policy> getData()
	{
		return repo.findAll();
	}

	public void savePolicy(Policy obj) {
		repo.save(obj);
		
	}

}
