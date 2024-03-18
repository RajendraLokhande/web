package com.Static;

class A
{
	static
	{
		System.out.println("i am in static block class A");
	}
}	
class static3
{
		
	static
	{
		System.out.println("i am in static class Satic3");
	}

	public static void main(String[] args) {
		{
		A ob=new A();
			
			System.out.println("i am in main method");  // top to bottom will  print. 
		}
	}
		
}

