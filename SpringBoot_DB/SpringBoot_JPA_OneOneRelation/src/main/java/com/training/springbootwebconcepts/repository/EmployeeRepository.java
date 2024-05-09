package com.training.springbootwebconcepts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springbootwebconcepts.entityclases.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
