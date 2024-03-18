package com.Static;

class Test
{
	static class Inner  
	{
		static void show()
		{
			System.out.println("1");
		}
	}
}

final class StaticNestedClass2{

	public static void main(String[] args) {
		
		
		Test.Inner.show();

	}

}
