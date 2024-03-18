package com.spring;


public class BillCollector {
		
		public IPayment payment;
		
		public void setPayment(IPayment payment) {
			this.payment=payment;
		}
		
		public BillCollector() {
			
		}
		
	    public BillCollector(IPayment payment){
			this.payment=payment;
		}
		
		
		public void collectPayment(double amount) {
			
			String status = payment.pay(amount);
	        System.out.println(status);
		}
	
}
