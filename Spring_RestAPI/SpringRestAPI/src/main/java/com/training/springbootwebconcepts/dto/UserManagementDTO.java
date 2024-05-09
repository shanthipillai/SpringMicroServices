package com.training.springbootwebconcepts.dto;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class UserManagementDTO {

	private String name;
	private String id;
	private String email;
	private String contact;
}
