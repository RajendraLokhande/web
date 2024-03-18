package com.Demo2;

public interface I3 
{

public boolean test (int no); 
	
}
class A implements I3 
{
	 public boolean test (int no) 
	{
		return no%2==0;
	}	
}