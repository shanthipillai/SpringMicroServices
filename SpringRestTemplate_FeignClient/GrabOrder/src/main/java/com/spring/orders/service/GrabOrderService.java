package com.spring.orders.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.orders.dto.GrabOrderPaymentDto;

@Service
public class GrabOrderService {

	public String initiatePayment(GrabOrderPaymentDto paymentDetails) {

		String url = "http://localhost:8999/netbanking/makepayment";
		HttpHeaders httpheaders = new HttpHeaders();
		httpheaders.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<GrabOrderPaymentDto> httpentity = new HttpEntity<GrabOrderPaymentDto>(paymentDetails, httpheaders);
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.exchange(url, HttpMethod.POST, httpentity, String.class);

		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		String responsebody=response.getBody();
		response.getHeaders();
		response.getStatusCode();
		return responsebody; 
	}

}
