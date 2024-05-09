package com.training.springbootwebconcepts.dto;

import lombok.Data;

@Data
public class UserAddress {
private String state;
private String city;
private long pincode;
private String country;
}
