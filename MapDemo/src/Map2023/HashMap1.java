package Map2023;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		
		HashMap hm=new HashMap ();
		hm.put(10, "aaa");
		hm.put(20, "bbb");
	    hm.put(30, "ccc");
	    hm.put(40, "ddd");
	    
	    System.out.println(hm);             //bbb,ddd,aaa,ccc
//	    System.out.println(hm.get(10));     // aaa
//	    System.out.println(hm.remove(30));   //aaa,bbb,ddd
//	    hm.clear ();             //{}empty
	    
//	    System.out.println(hm.size());         //4
			
//	    System.out.println(hm.containsKey(40));       //true     
//	    System.out.println(hm.containsValue("aaa"));   //true
	    System.out.println(hm.values());       //true     


	}

}
