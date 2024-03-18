package SortedSet2023;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {

	SortedSet ss=new TreeSet ();
//	ss.add(10);
 // ss.add(30);
//	ss.add(60); 
//	ss.add(90);
//	ss.add(40); print:10,30,40,60,90
	
	ss.add("aaa");
	ss.add("ccc");
	ss.add("ddd");
    ss.add("bbb");  //print:aaa,bbb,ccc,ddd
    
	System.out.println(ss);
	
		
	}

}
