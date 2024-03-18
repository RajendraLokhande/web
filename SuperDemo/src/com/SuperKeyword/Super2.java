package com.SuperKeyword;

class Team
{
	
	void show ()
	{
		
		System.out.println("i am in class A");
	}
}
class Sample extends Team
{
	
		void show ()
		{
			System.out.println("i am in class B");
		}
		void m1()
		{
		//	System.out.println("1");
			super.show();
		//	System.out.println("2");
		}		
}

public class Super2 {

	public static void main(String[] args) {
     
		Sample s=new Sample();
		s.m1();
		
	}

}
