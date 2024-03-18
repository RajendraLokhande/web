package com.variable;

public class Test {
	
	
   static int b=20;
   int c=30;
   
	public static void main(String[] args) {
		
  int a=10;
  
  Test t=new Test ();
  
  System.out.println(a);        // (variable)
  System.out.println(t.b);      // (class.variable/ obj ref. variable)
  System.out.println("ref:c");  // (ref: variable)
  
  
	}

}
