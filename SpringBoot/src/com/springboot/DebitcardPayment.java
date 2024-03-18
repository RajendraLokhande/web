package com.springboot;

public class DebitcardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		
//logic for debit card payment
		return "Payment Sucessfull through the Debit Card";
	}

}
