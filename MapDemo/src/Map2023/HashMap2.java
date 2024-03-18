package Map2023;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
	
		
		HashMap<String,String> hm=new  HashMap<Strin,String>();
		
		hm.put("10", "aaa");
		hm.put("20", "bbb");
	    hm.put("30", "ccc");
	    hm.put("40", "ddd");
	    
	    for (Map.Entry me:hm.entrySet())
	    {
	    	System.out.println(me.getKey()+" : "+me.getValue());
	    }
	}

}
