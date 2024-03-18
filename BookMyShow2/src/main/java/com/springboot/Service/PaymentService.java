package com.springboot.Service;

import java.util.List;

import com.springboot.Dto.PaymentDto;

public interface PaymentService {

	public PaymentDto addPayment(PaymentDto Dto);
	public PaymentDto getPayment(Integer Id);
	public List<PaymentDto>getAllPayment();
	public PaymentDto updatePayment(PaymentDto Dto, Integer Id);
	public PaymentDto deletePayment(Integer Id);

	
}
