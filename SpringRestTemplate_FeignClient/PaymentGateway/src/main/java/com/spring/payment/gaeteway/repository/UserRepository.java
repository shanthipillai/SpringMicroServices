package com.spring.payment.gaeteway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.payment.gaeteway.entity.UserRegistrations;

@Repository
public interface UserRepository extends JpaRepository<UserRegistrations, Long>{



	UserRegistrations findByUserNameAndPassword(String userName, String password);

	

	



}
