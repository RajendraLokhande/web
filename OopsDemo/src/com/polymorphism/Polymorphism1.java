package com.polymorphism;


class X 
{
	void sum(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	
	void sum(float a, float b)
	{
		float res=a+b;
	 System.out.println(res);
	}
	
}
public class Polymorphism1 {

	public static void main(String[] args) {

		X x=new X ();
		x.sum(10,20);
		x.sum(10.4f, 20.7f);
		
	}

}
