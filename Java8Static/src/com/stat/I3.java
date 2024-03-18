package com.stat;

public interface I3 {

	
	void m1 ();
	
	static void m2() {
		
		
		System.out.println("i am  static method");
	}		
}

class A3 implements I3 {
	
	public void m1() {
		
	}
	
	public static void m2() {  //(System.out.println("i am  static methosd"); we can not override)
	}		
	
}



