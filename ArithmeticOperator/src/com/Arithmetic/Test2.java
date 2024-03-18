package com.Arithmetic;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int a=10;
		int b=20;

		int c='+';
		
		
		switch (c) {

		
		case '+': System.out.println("addition of two numers:"+(a+b));

			break;
		case '-': System.out.println("SubstraCTION OF Two numbers:"+(a-b));

			break; 
		case '*': System.out.println("Multiplication of two numbers:"+(a*b));

			break; 
		case '/': System.out.println("Division of Two Numbers:"+(a/b));

			break;

		default:
			System.out.println("inavlid statement...!!");
			break;
		}
	}
}
