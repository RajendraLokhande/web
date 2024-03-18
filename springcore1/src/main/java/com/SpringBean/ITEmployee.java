package com.SpringBean;



public class ITEmployee {


	public EmpSalary payment;
	
	public void setPackage(EmpSalary payment) {
		this.payment= payment;
	}
		
	public ITEmployee() {
		
	}
	
	
	public ITEmployee(EmpSalary payment) {
		this.payment=payment;
		
	}	
    public void payPayment(double amount) {


			String status = payment.pay(amount);
	        System.out.println(status);	
		}
		
	}
	


