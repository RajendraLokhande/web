package oops2023;


class X
{
	void show1()
	
	{
		System.out.println("i am in class X");
	}
}
class Y extends X
{
	void show2()
	
	{
	 System.out.println("i am in class Y");
		
	}
}
class Z extends Y
{
	void show3()
	
	{
		System.out.println("i am in class Z");
		
	}
}
class MultilevelInheritance1 
{
	public static void main (String [] args)
	{
		X ob1=new X();
		ob1.show1();
		
		Y ob2=new Y();
		ob2.show2();
		ob2.show1();
		
		
		
		Z ob3=new Z();
		ob3.show3();
		ob3.show2();
		ob3.show1();
		
	}
}