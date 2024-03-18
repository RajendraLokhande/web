package com.polymorphism;


class T
{
	void display(String a)
	{
		System.out.println("1");
	}
	void display(int a)
	{
		System.out.println("2");
	}
}

public class polymorphism2 {

	public static void main(String[] args) {

		
		T t=new T();
		t.display(10);
		t.display("raj");
	
	}

}
