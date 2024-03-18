package com.LinkedList2023;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args){

		LinkedList ll=new LinkedList ();
		ll.add("suresh");
		ll.add("ganesh");
		ll.add("navin");
		
		//ll.remove(2);
	
		System.out.println(ll.removeFirst()+" elemete is removed" ); 
		System.out.println(ll);
		
		}

}
