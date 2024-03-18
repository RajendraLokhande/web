package com.This;


class Test
{
	Test()
	{
		
		this(10);
		System.out.println("default constuctor");
	}
	Test(int a)
	{
		this("rajendra");
		System.out.println(a);	
	}
	Test(String a)
	{
		System.out.println(a);
	
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {

		Test t=new Test();	
	}

}
