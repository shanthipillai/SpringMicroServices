package com.spring.payment.gaeteway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.payment.gaeteway.dto.PaymentDto;
import com.spring.payment.gaeteway.dto.UserRegistrationDto;
import com.spring.payment.gaeteway.service.PaymentService;

@RestController
@RequestMapping("/netbanking")
public class PaymentController {

	@Autowired
	PaymentService service;
	
	@PostMapping("/registeruser")
	public String register(@RequestBody UserRegistrationDto request)
	{
		service.register(request);
		
		return "Registeration has successfully been completed";
	}
	
	
	@PostMapping("/makepayment")
	public String makePayment(@RequestBody  PaymentDto pay)
	{
		return service.makePayment(pay);
		
	}
	
}
