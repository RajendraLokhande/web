package Cursor2023;

import java.util.ArrayList;


public class Test2 {
	
	
  String name;
  int id;
  
  @Override
  public String toString()
    {
     return name+","+id;
    }
  
     public static void main(String [] args) {
	  Test2 t2=new Test2 ();
	  t2.name=("deepak");
	  t2.id=(101);
	  
	  System.out.println(t2);
	  
	 // ArrayList al=new ArrayList ();
	  
	 // al.add("ganesh");
	//  al.add("parag");
	  
	//  System.out.println(al);
	  
	  
	  
	  
	  
  }
}

