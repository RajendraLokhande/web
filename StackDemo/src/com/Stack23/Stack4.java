package com.Stack23;

import java.util.Stack;

public class Stack4 {

	public static void main(String[] args) {

		Stack s=new Stack ();
		s.push("aaa");
		s.push("sss");
		s.push("ttt");
		s.push("hhh");
		s.push("ppp");
			
		System.out.println(s.search("ttt"));    //3
		System.out.println(s.search("zzt"));     //-1
	
	}

}
