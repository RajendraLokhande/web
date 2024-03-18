package com.polymorphism;

class V
{
	void show()

	{
		System.out.println("1");
	}
}
class W extends V
{
	void show()
	{
		System.out.println("2");
	}
}
public class MOverrding1 {
	
	public static void main(String [] args) {
		
		V ob1=new V();
		ob1.show();
		
	}

}
