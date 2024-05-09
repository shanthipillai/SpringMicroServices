package com.training.springbootwebconcepts.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
//JSON Payload Structure

@Data
public class UserReqisterDto {

	private String firstName;
	private String lastName;
	private String gender;
	private String city;
	private String email;
	private long mobile;
	private UserAddress address;
	
	
}
