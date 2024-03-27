package com.animal;

public class Animal {

	public void eat()
	{
		System.out.println("i am eating");
	}
	
    private void run() 
    {
    	System.out.println("i am runing");
	}

	public static void main(String[] args) {
		
		System.out.println("1");
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();
	}

	
}
