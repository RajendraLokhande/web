package com.Arithmetic;

public class A {


		    public static void main(String[] args) {
		        // Given values
		        int no1 = 10;
		        int no2 = 20;
		        char operation = '+';

		        // Result variable
		        int result = 0;

		        switch (operation) {
		            case '+':
		                result = no1 + no2;
		                break;
		            case '-':
		                result = no1 - no2;
		                break;
		            case '*':
		                result = no1 * no2;
		                break;
		            case '/':
		                if (no2 != 0) {
		                    result = no1 / no2;
		                } else {
		                    System.out.println("Error: Cannot divide by zero.");
		                    return;
		                }
		                break;
		            default:
		                System.out.println("Invalid operation. Please enter +, -, *, or /.");
		                return;
		        }

		        System.out.println("Result: " + result);
		    }
}
