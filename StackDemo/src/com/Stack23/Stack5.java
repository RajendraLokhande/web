package com.Stack23;

import java.util.Stack;

public class Stack5 {

	public static void main(String[] args) {

		Stack s=new Stack ();
		s.push("aaa");
		s.push("kkk");
		s.push("yyy");
		
		System.out.println(s.empty());   //false
		s.clear();
		System.out.println(s.empty());   //true
	}

}
