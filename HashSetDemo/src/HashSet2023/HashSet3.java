package HashSet2023;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {

	ArrayList al=new ArrayList ();
	al.add("aaa");
	al.add("jjj");
	
	
	HashSet hs=new HashSet(al);
	
	hs.add("kkk");
	hs.add("yyy");
	
	System.out.println(hs);	
	}

}
