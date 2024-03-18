package com.Demo3;

public class Test5 {

	public static void main(String[] args) {
		
		Runnable r= ()->
		
		{
		for (int i=1; i<=5; i++)
		{
			
			System.out.println("hi i am child thread");
		}
    };
    
    
    Thread t=new Thread(r);
    t.start();
    
    for(int  i=1; i<=5; i++ )
    	
    {
    	System.out.println("hi i am main thread");
    }
   };

}

