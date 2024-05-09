package com.spring.rest.security.explore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Policy {

	@Id
	private int policyId;
	@Column
	private String policyType;
	@Column
	private int policyDept;
	
}
