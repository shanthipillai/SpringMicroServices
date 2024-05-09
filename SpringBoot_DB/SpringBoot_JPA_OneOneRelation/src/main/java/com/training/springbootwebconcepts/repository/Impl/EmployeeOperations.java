package com.training.springbootwebconcepts.repository.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.springbootwebconcepts.entityclases.Address;
import com.training.springbootwebconcepts.entityclases.Employee;
import com.training.springbootwebconcepts.repository.AddressRepository;
import com.training.springbootwebconcepts.repository.EmployeeRepository;

import jakarta.transaction.Transactional;
@Component
@Transactional
public class EmployeeOperations {

	@Autowired
	EmployeeRepository repository;
	AddressRepository address;
    public void saveEmployee(Employee emp)
    {
    	
    	repository.save(emp);
    	
    	
    }
    
    public void saveAddress(Address addr)
    {
    	address.save(addr);
    }
   public void deleteEmployee(int id)
   {
	   repository.deleteById(id);
   }
   
   public void updateEmployee()
   {
	//Employee emp=   repository.getById(7517);
	//emp.getAddress().setCity("Manikonda");

	
	   
   }
    
}
