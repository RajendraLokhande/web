package com.demo;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {

	Consumer<String> c= str ->System.out.println("hi : "+str.concat("@gmail.com"));
		c.accept("rajendra");
		
		
	}

}
