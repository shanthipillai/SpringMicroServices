package com.spring.payment.gaeteway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.payment.gaeteway.dto.PaymentDto;
import com.spring.payment.gaeteway.dto.UserRegistrationDto;
import com.spring.payment.gaeteway.entity.UserRegistrations;
import com.spring.payment.gaeteway.repository.UserRepository;

@Service
public class PaymentService {
	@Autowired
    UserRepository repository;
	public void register(UserRegistrationDto request) {
	UserRegistrations register=UserRegistrations.builder().accountNumber(request.getAccountNumber())
	.firstName(request.getFirstName()).userName(request.getUserName())
	.password(request.getPassword()).balance(request.getBalance()).contact(request.getContact()).build();
	repository.save(register);
		
	}
	
	
	public String makePayment(PaymentDto pay) {
		// TODO Auto-generated method stub
		
		UserRegistrations user=	findUserIdByPassword(pay.getUserName(), pay.getPassword());
		if(user!=null)
		{
			double finalBalance=user.getBalance()-pay.getAmount();
			user.setBalance(finalBalance);
			repository.save(user);
			return "Amount has successfully been debited.  Your current balance is "+finalBalance;
		}
		return "Invalid User";
	}
	public UserRegistrations findUserIdByPassword(String userName, String password) {
	
		
		return repository.findByUserNameAndPassword(userName,password);
		
	}

}
