package com.TaxDemo;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	

	Scanner sc =new Scanner (System.in);

    int empId;
	String empName;
	int empAge;
	String city;
    Double ctc;
 

	public Employee(){
			
}				
 public Employee(Scanner sc, int empId, String empName, int empAge, String city, Double ctc) {
		this.sc = sc;
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.city = city;
		this.ctc = ctc;
	}


 public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String name=sc.next();
		
		System.out.println("Enter Employee Age");
		int age=sc.nextInt();
		
		System.out.println("Enter Employee City");
		String city=sc.next();

		System.out.println("Enter Employee CTC");
		double ctc=sc.nextDouble();
		
	    
		System.out.println("------------------------------------------");
		
		 
		 int investment= 80000;
			
			
			
		    double basicSalary=0.4*ctc;	
			double hra= 1*ctc;
		    double taxableIncome= basicSalary + hra - investment;
		    double taxRate= 0.2;
		    double taxAmount= taxableIncome * taxRate;
			double netSalary = ctc-taxAmount;
			
			System.out.println("\nEmployee Id:"+ id +"\nEmployee Name:"+name+"\nEmployee Age"+age+"\nEmployee City"+city+"\nEmployee CTC:"+ctc);
			
			System.out.println("Basic Salary:"+basicSalary);
			System.out.println("HRa:"+hra);
			System.out.println("Taxable:"+taxableIncome);
			System.out.println("TaxRAte:"+taxRate);
			System.out.println("TAxAmount:"+taxAmount);
			System.out.println("In Hand Salary Salary:"+netSalary);
	   }
}	
  
 