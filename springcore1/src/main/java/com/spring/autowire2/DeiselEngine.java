package com.spring.autowire2;

public class DeiselEngine {

	public DeiselEngine() {
		System.out.println("DeiselEngine::Costructor");
		
	}
	
	public int start() {
		//logic 
		System.out.println("DeiselEngine Starting..");
		return 1;	
	}
}
