package SortedSet2023;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet2 {

	public static void main(String[] args) {

		SortedSet ss=new TreeSet();
		ss.add("aaa");
		ss.add("bbb");
		ss.add("ccc");
		ss.add("ddd");
		
		
		//System.out.println(ss);	    // aaa,bbb,ccc
	//	System.out.println(ss.first());	 ///aaa
	//	System.out.println(ss.last());	//ccc
	//	System.out.println(ss.tailSet("aaa"));	
		System.out.println(ss.subSet("aaa", "ccc"));	
		
		
	}

}
