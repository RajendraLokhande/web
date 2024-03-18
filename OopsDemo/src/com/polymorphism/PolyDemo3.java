package com.polymorphism;


class A
{
	void display(Object b)
	{
		System.out.println("1");
	}
	void display(String b)
	{
		System.out.println("2");	
	}
    void display(StringBuilder b)
    {
    	System.out.println("3");
    }	
	
}
public class PolyDemo3 {

	public static void main(String[] args) {

		A a=new A ();
		a.display("raj");
	    a.display(new StringBuilder("rahul"));
		a.display(new Object());
	}

}
