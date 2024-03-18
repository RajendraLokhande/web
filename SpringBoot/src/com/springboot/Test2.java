package com.springboot;

public class Test2 {

	public static void main(String[] args) { // (Test2- is public variable demo) Test3 is private variable
		
		BillCollector bc = new BillCollector ();
		
		CreditcardPayment ccd =new CreditcardPayment();
		bc.payment=ccd;
		
		bc.collectPayment(2000);

	}

}
