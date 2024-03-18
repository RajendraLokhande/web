package com.predicate;

public interface I1 {

	public boolean test (int no);
	
}
class A implements I1
 {
	public boolean test (int no) 
	{
		return no%2==0;
	}
 }
