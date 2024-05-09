package com.spring.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.orders.dto.GrabOrderPaymentDto;
import com.spring.orders.service.GrabOrderService;

@RestController
@RequestMapping("/graborders")
public class GrabOrderControlller {
@Autowired
	GrabOrderService service;

@PostMapping("/makepayment")
	public String initiatePayment(@RequestBody GrabOrderPaymentDto paymentDetails )
	{
		
		
		return service.initiatePayment(paymentDetails);
		
	}
}
