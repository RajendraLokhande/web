package com.predicate;

public interface I2 {
	
	public boolean test(int no);
	
}	
class B implements I2
{

	public boolean test(int no)
	
	{
		return no%2==0;
	}

}	
	