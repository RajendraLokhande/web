package com.polymorphism;


class D
{
	void display(String s, int t)
	{
		System.out.println("1");
	}
	
	void display(int t, String s)
	{
		System.out.println("2");
	}
	
}

public class PolyDemo5 {

	public static void main(String[] args) {

	D d=new D();
	d.display(10,"Raj");
    d.display("Raj",10);		
			
	}

}
