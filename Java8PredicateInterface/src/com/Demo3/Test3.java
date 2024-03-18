package com.Demo3;

import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {
		
		Predicate<String> p1= pass1 -> pass1.length()> 6;
		Predicate<String> p2= pass2-> pass2.equals("raj@12345");
		
		System.out.println(p1.test("abc"));
		System.out.println(p1.test("raj@12345"));
		
		Predicate p=p1.or(p2);
		
		System.out.println(p.test("raj@12345"));
		
		
	}

}
