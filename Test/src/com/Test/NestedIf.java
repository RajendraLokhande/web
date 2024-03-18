package com.Test;

public class NestedIf {

	public static void main(String[] args) {

		int no1=10;
	    if(no1>1)
	    {
	        
	    	System.out.println("hello 1");
	    }
	    if(no1>5)	
	       {
	         if(no1>6)
	         {
	        	 System.out.println("hello 5");
	         }
	         
	       }
	        	 	    
	    else if (no1>10) 
	    {
	    	if(no1>8);
		      {
			    System.out.println("hello 3"); 
		      }
	    }
	}	
	
}

