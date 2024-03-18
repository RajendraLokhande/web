package com.polymorphism;

class S
{
	void display(String a)
	{
		System.out.println(1);	
	}
	void display(int a)
	{
		System.out.println(2);
	}	
}
public class PolyDemo4 {

	public static void main(String[] args) {

		S s=new S();
		s.display(10);
		s.display("10");
	
	}

}
