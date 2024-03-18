package SortedMap2023;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {

	public static void main(String[] args) {

	SortedMap sm=new TreeMap ();
	sm.put(100,"amit");
	sm.put(110,"umesh");
	sm.put(120,"kiran");
	sm.put(130,"suman");
	sm.put(140,"arun");
	
	System.out.println(sm);  
	System.out.println(sm.firstKey());
	System.out.println(sm.lastKey());
	System.out.println(sm.headMap(120));	
	System.out.println(sm.tailMap(110));
	System.out.println(sm.subMap(110,140));  
	System.out.println(sm.get(120));
	System.out.println(sm.remove(100)); 
	System.out.println(sm.containsKey(130)); 	
	System.out.println(sm.comparator());  
	
	}

}
