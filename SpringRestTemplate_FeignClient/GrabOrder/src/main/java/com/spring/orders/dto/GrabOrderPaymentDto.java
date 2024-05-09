package com.spring.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class GrabOrderPaymentDto {

	private double amount;
	private String userName;
	private String password;
}
