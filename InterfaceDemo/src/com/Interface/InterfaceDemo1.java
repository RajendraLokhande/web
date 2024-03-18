package com.Interface;

interface Vehicle
{
	void start();
	void noOfGears(int a);	
}
class Bus implements Vehicle
{
	int gears;
	public void start()
	
	{
		System.out.println("bus start with key");
	}
	public void noOfGears (int gears1)
	{
		System.out.println("Bus has "+gears+" gears");
	}
	
}
class Car implements Vehicle
{
	int gears;
	public void start()
	
	{
		System.out.println(" bus start with key");
	}
	public void noOfGears (int gears1)
	{
		System.out.println("Car has "+gears+" gears");
	}
	
}
class Scooter implements Vehicle
{
	int gears;
	public void start()
	
	{
		System.out.println("Scooter start with kick");
	}
	public void noOfGears (int gears1)
	{
		System.out.println("Scooter has "+gears+" gears");

	}
	
}

class InterfaeDemo1
{
	public static void main(String[] args) {

	//Vehicle v=new Vehicle (); we can not create object of interface
	
	Bus b=new Bus();
	b.start();
	b.noOfGears(6);
	
	Car c=new Car();
	c.start();
	c.noOfGears(6);
	
	Scooter s=new Scooter ();
	s.start();
	s.noOfGears(4);
			
	}
}




