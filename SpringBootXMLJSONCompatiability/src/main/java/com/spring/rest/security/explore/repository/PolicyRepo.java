package com.spring.rest.security.explore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.security.explore.entity.Policy;

@Repository
public interface PolicyRepo extends JpaRepository<Policy, Integer> {

}
