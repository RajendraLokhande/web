package com.demo3;

import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {

//		Function <String, String> f = str->str.concat(" is java developer"); (print- rajendra is java developer, manish also)
		Function <String, 	Integer> f = str->str.length(); 
	
		
		System.out.println(f.apply("rajendra"));
		System.out.println(f.apply("Manish"));
		}

}