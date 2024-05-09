package com.training.springbootwebconcepts.entityclases;

import org.hibernate.mapping.Join;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Data
@Entity
@Table(name="orgemployees")
public class Employee {
    @Id
	private int Id;
	private String name;
	private double salary;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_aid")
	private Address address;
}
