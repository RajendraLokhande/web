package com.Static;

class Page Visitors

	static int count=0;
	void PageVisitors()
	{
		count=count+1;
	}
	void noOfVisitors()
	{
		System.out.println(count);
    }
}






public class Static Demo2 {

	public static void main(String[] args) {

		PageVisitors v1 =new PageVisitors ();
		PageVisitors v2 =new PageVisitors ();
		PageVisitors v3 =new PageVisitors ();
        PageVisitors v4 =new PageVisitors ();
		PageVisitors v5 =new PageVisitors ();
		
		
		v5.noOfVisistors();
	}
}
