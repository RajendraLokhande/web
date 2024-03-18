package com.AbstractNew;


abstract class Vehicle
{
	abstract void start();
	{
	 System.out.println("start with key");	
	 System.out.println("start with kick");	
	}
} 
class Car extends Vehicle
{
	void start()
	{
		System.out.println("start with key");
	}
}
 class Scooter extends Vehicle
{
	void strat()
	{
		System.out.println("start with kick");
		
	}

	@Override
	void start() {
		}
	public static void main(String [] args) {
		
		Car c =new Car();
		c.start();
		
		System.out.println("--------------");
		
        Scooter s=new Scooter ();
        s.start();
	}
}