package com.ArrayList2;

import java.util.ArrayList;

public class ArrayList6 {
	

	public static void main(String[] args) {
	
	ArrayList al1=new ArrayList ();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	
	ArrayList al2=new ArrayList ();
	al2.add("mohan");
	al2.add("soham");
	
	al1.addAll(2, al2);
	
	System.out.println(al1);
	System.out.println(al2);
}

}