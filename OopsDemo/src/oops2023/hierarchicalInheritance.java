package oops2023;

class S
{
	void show1()
	
	{
		System.out.println("i am in class S");
	}
}
class T extends S
{
	void show2()
	{
		System.out.println("i am in class T");
	}
}
class R extends S
{
	void show3()
	
	{
		System.out.println("i am in class R");
	}
}

public class hierarchicalInheritance {

	public static void main(String[] args) {

		S ob1=new S();
		ob1.show1();
		
		T ob2=new T();
		ob2.show2();
		ob2.show1();
		
		R ob3=new R();
		ob3.show3();
		ob3.show1();
		
	}
}