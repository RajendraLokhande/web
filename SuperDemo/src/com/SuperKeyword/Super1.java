package com.SuperKeyword;

class Test
{
	int no=10;
}
class Example extends Test
{
	int no=20;
	void show (int no)
	{
	//	System.out.println(no);
	//	System.out.println(this.no);
		System.out.println(super.no);

	}
	
}
public class Super1 {

	public static void main(String[] args) {
		
		Example e=new Example();
		e.show(30);
		

	}

}
