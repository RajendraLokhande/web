package com.ArrayList2;

public class Test {
	
	
	
      public class Test implements Cloneable
      {
     
		int i; 
		
		String str;	
		
	    Test(){}
	    
	    Test(int i, String str)
         
	    {
	    	this.i=i;
	    	this.str=str;
	    }
	    
	public static void main(String[] args) throws CloneNotSupportException
	{ 
      Test t1=new Test(10, "arun");
      Test t2=(Test)t1.clone();
      System.out.printin(t2.i);
      System.out.println(t2.str);
    }
	
  }
}