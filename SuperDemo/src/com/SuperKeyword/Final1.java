package com.SuperKeyword;

class J  // final class J it is also not possible: final class can not be inherit. 
{
	void m1()
	{
		System.out.println("i am in class J");
		
	}
}
class K extends J // child class can be inherit, 
{
	void m1() //final method can not be override
	{
	
		System.out.println("i am in class K");
	
	}
}


public class Final1 {

	public static void main(String[] args) {
		
		J ob=new K();
		ob.m1();	

	}

}
