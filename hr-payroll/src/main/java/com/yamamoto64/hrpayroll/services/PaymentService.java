package com.yamamoto64.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.yamamoto64.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workdId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
