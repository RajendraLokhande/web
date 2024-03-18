package com.ArrayList2;

import java.util.ArrayList;

public class ArrayList3 {
	
	
	public static void main(String[] ags) {
		
	ArrayList al1=new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	
	ArrayList al2=new ArrayList();
	al2.add("rajendra");
	al2.add("sidharth");
	
	al1.addAll(al2);
       
	System.out.println(al1);
	System.out.println(al2);
	
	}

}
