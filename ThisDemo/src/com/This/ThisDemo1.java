package com.This;

public class ThisDemo1 {
	
	
    void m1()
    {
    	System.out.println("i am in m1 method: "+this);
    }
    
	public static void main(String[] args) {

		ThisDemo1 ob=new ThisDemo1();
		System.out.println("i am in main method: "+ob);
		ob.m1();
	}

}
