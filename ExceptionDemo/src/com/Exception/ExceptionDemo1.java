package com.Exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	

	try
	{
	int n1=Integer. parseInt(args[0]);
	int n2=Integer. parseInt(args[0]);
	System.out.println("we have got two numbers..");
	int result = n1%n2;
	System.out.println("Division is result");
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("n2 can not be 0 !!");
		System.out.println(e.getMessage());
	}
    catch(NumberFormatException e)
	{
		System.out.println("Invalid Numbers !!");
		System.out.println(e.getMessage());

	}
	catch(IndexOutOfBoundsException e) {
		
		
	    System.out.println("Error  !!");
	    System.out.println(e.getMessage());
	}
  }
}