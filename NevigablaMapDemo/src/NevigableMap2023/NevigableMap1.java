package NevigableMap2023;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NevigableMap1 {

	public static void main (String []args) {
	NavigableMap nm=new TreeMap ();
	nm.put(100,"amit");
	nm.put(110,"umesh");
	nm.put(120,"kiran");
	nm.put(130,"suman");
	nm.put(140,"arun");
	
	System.out.println(nm);
	System.out.println(nm.descendingMap());
	System.out.println(nm.ceilingEntry(120));
	System.out.println(nm.floorKey(100));
	System.out.println(nm.higherKey(120));
	System.out.println(nm.lowerEntry(120));
	
	}
}