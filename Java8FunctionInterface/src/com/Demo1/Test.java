package com.Demo1;

import java.util.function.Function;

public class Test {



	public static void main(String[] args) {

	//	Function<Integer, Integer> f=sal ->sal*12;    
		Function<Integer, Integer> f=sal ->sal*12;           
		
		
		System.out.println(f.apply(35000)+"lpa");
	//	System.out.println(f.apply(50000)+"lpa");
		
		
	}

}
