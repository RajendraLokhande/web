package com.spring;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double amount) {
		
//logic for upi payment
		return "Upi Payment Sucessfull through the Upi Payment";
	}

}
