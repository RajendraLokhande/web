package Cursor2023;

import java.util.Iterator;
import java.util.Vector;

public class Cursor3 {

	public static void main(String[] args) {

		Vector v=new Vector ();
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		v.add("ddd");
		
		Iterator itr=v.iterator ();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}	
		
		
	}

}
