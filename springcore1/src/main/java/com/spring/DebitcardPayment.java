package com.spring;


     public class DebitcardPayment implements IPayment {

		@Override
		public String pay(double amount) {
			
	           // logic for debit card payment
		return "Payment sucessfull through the Debit Card";
	
		}	
	}
	