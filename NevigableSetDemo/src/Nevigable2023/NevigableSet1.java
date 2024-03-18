package Nevigable2023;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NevigableSet1 {

	public static void main(String[] args) {

		
		NavigableSet ns=new TreeSet ();
		ns.add("aaa");
		ns.add("bbb");
		ns.add("ccc");
		ns.add("ddd");
		ns.add("eee");
		
	//	System.out.println(ns.pollFirst());	//aaa
	//	System.out.println(ns.pollLast()); //eee
	//	System.out.println(ns.floor("ccc")); //ccc
		System.out.println(ns.lower("bbb"));  //aaa
	//	System.out.println(ns.higher("aaa"));  //bbb
	//	System.out.println(ns.ceiling("ccc")); //ccc
		System.out.println(ns.descendingSet()); //
		
		
		
		
		
	}

}
