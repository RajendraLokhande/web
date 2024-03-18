package com.Do.While.Demo;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	
	{

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name");
	    String name =s.next();
		System.out.println("your name is : "+name);
				
		System.out.println("----------------------------");
		
		System.out.println("Enter your pin no");
	    int pinno =s.nextInt();
		System.out.println("your pin is :  "+pinno);
		
		
		
	}

}
