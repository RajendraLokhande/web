package com.spring;

public class CreditcardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		
 // logic for credit card payment
		return "Payment sucessfull through the Credit Card";
	}

}
