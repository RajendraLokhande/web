package Vector2023;

import java.util.Vector;

    public class Vector5 {

	public static void main(String[] args){

		
		Vector v=new Vector (5);
		System.out.println(v.capacity());
		
		for (int i=0; i<5; i++)
		{
			v.addElement(i);
			
		}
		System.out.println(v);
		System.out.println(v.capacity());	
		
	}
}
