package com.spring.payment.gaeteway.dto;


import lombok.Data;

@Data
public class UserRegistrationDto {


	
	private long accountNumber;

	private String firstName;

	private double balance;

	private String userName;

	private String password;
	
	private String contact;
}
