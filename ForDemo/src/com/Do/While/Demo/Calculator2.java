package com.Do.While.Demo;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {

		
	Scanner s=new Scanner (System.in);
	
	 System.out.println("Enter 1st no");
	 int no1=s.nextInt();
	
	
	 System.out.println("Enter 2nd no");
	 int no2=s.nextInt();
	
	System.out.println("Enter symbol(+,-,*,%)");
	String sym= s.next();
	
	
	
	switch(sym)
	{
	
	case "+" :System.out.println(no1+no2);
	          break;
	
	case "-" :System.out.println(no1-no2);
              break;

	case "*" :System.out.println(no1*no2);
              break;

	case "/" :System.out.println(no1/no2);
              break;

    default: System.out.println("invalid sym");
	         break;

	}
	
	}

}
