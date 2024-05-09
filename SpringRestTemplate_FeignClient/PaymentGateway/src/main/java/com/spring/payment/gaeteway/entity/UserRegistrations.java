package com.spring.payment.gaeteway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrations {

	@Id
	private long accountNumber;
	@Column
	private String firstName;
	@Column
	private double balance;
	@Column
	private String userName;
	@Column
	private String password;
	
	@Column
	private String contact;
}
