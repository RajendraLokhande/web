package Cursor2023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor5 {

	public static void main(String[] args) {

		
		ArrayList al=new ArrayList ();
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		ListIterator li=al.listIterator();
		while(li.hasNext());
		{
	      System.out.println(li.next());	
		}
		
		System.out.println("-------------------");
		
		while(li.hasPrevious());
		{
			System.out.println(li.previous());
		}
	}

}
