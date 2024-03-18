package com.Static;

class Outer
{
	static class Inner  //static
	{
		void show()
		{
			System.out.println("1");
		}
	}
}

final class StaticNestedClass {

	public static void main(String[] args) {
		
	//	Outer ob1=new Outer();
	//	Outer.Inner ob2=ob1.new Inner();
  //		ob2.show();
		
		Outer.Inner ob=new Outer.Inner();
		ob.show();

	}

}
