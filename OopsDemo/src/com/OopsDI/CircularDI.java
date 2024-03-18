package com.OopsDI;

class A
{
	
	B b1;
	public void setB(B b2)
	{
		b1=b2;
	}
	
}
class B
{
	
	A a1;
	public void set(A a2)
	{
		a1=a2;
		
	}
}

public class CircularDI {



	public static void main(String[] args) {
	
		A ob1=new A();
		B ob2=new B();
		
		
		ob1.setB(ob2);
		ob2.setA(ob1);
		
	}

}
