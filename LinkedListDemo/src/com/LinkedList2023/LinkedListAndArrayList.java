package com.LinkedList2023;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAndArrayList {

	public static void main(String[] args) {

		ArrayList al=new ArrayList ();
		al.add("ganesh");
		al.add("ramesh");
		al.add("aaa");
		al.add("abc");
		al.add("kfc");
		
		LinkedList ll=new LinkedList (al); //( insertion or deletion )
		ll.addFirst("raj");                // (ArrayList to LinkedList)
		
		System.out.println(ll);
	}	
	
}
