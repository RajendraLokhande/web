package HashSet2023;

import java.util.HashSet;

public class HashSet4 {

	public static void main(String[] args) {

		HashSet hs=new HashSet ();
		hs.add("aaa");
		hs.add("jjj");
		hs.add("aaa");
		hs.add("jjj");
		
		System.out.println(hs); // duplicate value not store
			
	}

}
