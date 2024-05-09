package com.training.springbootwebconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.springbootwebconcepts.entityclases.Address;
import com.training.springbootwebconcepts.entityclases.Employee;
import com.training.springbootwebconcepts.repository.Impl.EmployeeOperations;

@SpringBootApplication
public class SpringBootJpaOneOneRelationApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext config=	SpringApplication.run(SpringBootJpaOneOneRelationApplication.class, args);
EmployeeOperations ops=	config.getBean(EmployeeOperations.class);
/*
Employee emp=new Employee();
Address addr=new Address();

emp.setName("Shanthii");
emp.setId(7517);
emp.setSalary(100000);

addr.setAddressId(13);
addr.setCity("Kondapur");
addr.setPincode(530016);
addr.setStreet("Kondapur");
emp.setAddress(addr);

ops.saveEmployee(emp);

*/

ops.updateEmployee();
	}

}
