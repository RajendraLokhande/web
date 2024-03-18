package com.polymorphism;

class H
{
	void display(int c)
	
	{
		System.out.println(c);
	}
	void display(int...c)
	{
	  for (int i:c)
		  {
		   System.out.print(i+" ");
	      }
	   System.out.println();
   }

public class PolyDemo7 {

	public static void main(String[] args) {
		
	H h=new H();
	h.display(10);
	h.display(10,20);		

	}
   }
}
