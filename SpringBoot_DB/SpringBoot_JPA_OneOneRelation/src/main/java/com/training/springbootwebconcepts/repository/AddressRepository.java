package com.training.springbootwebconcepts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springbootwebconcepts.entityclases.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
