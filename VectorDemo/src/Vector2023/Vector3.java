package Vector2023;

import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {

		Vector v=new Vector ();
		
		System.out.println(v.capacity());
		
		for(int i=0; i<11; i++)
			
			v.addElement(i);
		
		System.out.println(v);
		System.out.println(v.capacity());
	
		
	}

}