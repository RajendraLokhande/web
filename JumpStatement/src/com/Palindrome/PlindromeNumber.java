package com.Palindrome;

public class PlindromeNumber {

	public static void main(String[] args) {
		
		
		int no =12321;
		int temp=no;
		int rem, rev=0;
		while(temp!=0);
		
	{
		rem= temp%10;
		rev= rev*10+rem;
		temp=temp/10;
	}	
		
	if (no==rev)
	{
		System.out.println(no + "is polindrome number");
	}
	else
	{
		System.out.println(no + "is not polindrome number");

	}
  }

}
