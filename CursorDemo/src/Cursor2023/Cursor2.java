package Cursor2023;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor2 {

	public static void main(String[] args) {
 
		
		ArrayList al=new ArrayList ();	
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		
		Iterator itr=al.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		
		}
		
	}

}
