package com.eazybytes.accounts.controller;

import org.apache.hc.core5.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.accounts.dto.CustomerDetailsDto;
import com.eazybytes.accounts.service.ICustomerService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Pattern;

@Tag(
        name = "CRUD REST APIs for Customers in EazyBank",
        description = "CRUD REST APIs in EazyBank to CREATE, UPDATE, FETCH AND DELETE account details"
)
@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@Validated
public class CustomerController {
	private ICustomerService iCustomerService;
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	public CustomerController(ICustomerService iCustomerService)
	{
		this.iCustomerService=iCustomerService;
	}
	/*
	@GetMapping("/fetchCustomerDetails")
	public ResponseEntity<CustomerDetailsDto> fetchCustomerDetails(@RequestParam
            @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
            String mobileNumber)
	{
		CustomerDetailsDto customerDetailsDto=	iCustomerService.fetchCustomerDetails(mobileNumber);
	    return ResponseEntity.status(HttpStatus.SC_OK).body(customerDetailsDto);
	}
	*/
	
	
	 @GetMapping("/fetchCustomerDetails")
	    public ResponseEntity<CustomerDetailsDto> fetchCustomerDetails(@RequestHeader("eazybank-correlation-id")
	                                                                       String correlationId,
	                                                                    @RequestParam @Pattern(regexp="(^$|[0-9]{10})",
	                                                                            message = "Mobile number must be 10 digits")
	                                                                   String mobileNumber) {
	        logger.debug("eazyBank-correlation-id found: {} ", correlationId);
	        CustomerDetailsDto customerDetailsDto = iCustomerService.fetchCustomerDetails(mobileNumber, correlationId);
	        return ResponseEntity.status(HttpStatus.SC_OK).body(customerDetailsDto);

	    }

}
