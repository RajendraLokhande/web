package Vector2023;

import java.util.Vector;

     public class Vector7 {

	    public static void main(String[] args) {

		
		Vector v=new Vector (8,2);
		
		System.out.println(v);
		for(int i=0; i<15; i++)
		{
			v.addElement(i); // (this is vectors costructor)
		}	
			
		System.out.println(v);
		System.out.println(v.capacity());
				
	}

}
