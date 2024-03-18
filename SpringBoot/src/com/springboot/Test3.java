package com.springboot;


import java.lang.reflect.Field;

public class Test3 {        


	public static void main(String []args) throws Exception {
		
	Class <?> cl= Class.forName ("com.springbootBillCollector");
	
	Object obj = cl.newInstance();
	
	BillCollector bc= (BillCollector)obj;
	
	Field field = cl.getDeclaredField("payment");
	field.setAccessible(true);
	
	field.set(obj, new DebitcardPayment()); //injecting value to variable
	 
	bc.collectPayment(2000);	  // (this private variable field injection demo)
		
	}
}
