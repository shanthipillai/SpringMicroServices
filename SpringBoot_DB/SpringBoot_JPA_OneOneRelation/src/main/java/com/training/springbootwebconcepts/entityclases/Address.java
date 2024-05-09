package com.training.springbootwebconcepts.entityclases;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Data
@Entity
@Table(name="empaddresses")
public class Address {
	@Id
private int addressId;
private String street;
private long pincode;
private String city;

@OneToOne(mappedBy = "address")
Employee emp;

}
