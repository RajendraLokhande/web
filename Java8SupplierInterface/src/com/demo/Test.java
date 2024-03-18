package com.demo;

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {

	//	Supplier<Integer> s=() -> (int) (Math.random()*100);         - (print-31)
		
	//	System.out.println(s.get());
	
	Supplier<String> s = ()->
	                         {
		                       String[] names= {"amit","sunil","ajit","kiran","gita"};
		                       int i=(int)Math.random()*4;
		                       return names[i];
	                         };
	                         
	                         System.out.println(s.get());
		
	}

}
