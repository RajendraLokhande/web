package com.ArrayList2;

import java.util.ArrayList;

public class ArrayList13 {

	public static void main(String[] args) {
   
	ArrayList al=new ArrayList ();
	
	al.add(10);
	al.add(20);
	al.add(50);
	al.add(80);
	al.add("ganesh");
	al.add(00);
	
	al.removeAll(al);
	
	System.out.println(al);
   }

}  
