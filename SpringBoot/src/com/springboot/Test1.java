package com.springboot;

public class Test1 {
	
	public static void main (String [] arg)
	{
		
	
	    BillCollector bc = new BillCollector();
		//injecting CreditCard obj into BillCollector (Setting Injection)
		bc.setPayment(new CreditcardPayment());
		bc.collectPayment(1400);
		
		
		
		// injecting Creditcard obj in to Billcollector (constructor injection)
	    BillCollector bc1 = new BillCollector(new CreditcardPayment());
		bc1.collectPayment(1500.00);
		
		
		
	}
}
