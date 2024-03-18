package com.ArrayList2;

import java.util.ArrayList;

public class ArrayAndArrayList {

	public static void main(String[] args) {

		int[] arr=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		

	System.out.println(arr);
     for(int i:arr)
			
		    {
			  System.out.println(i);
			}
		//----------------------------
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		
		System.out.println(al);
		for(Object obj:al)
			
		   {
		      System.out.println(obj);
	       }
	}
   }

