package oops2023;

 
	
 class Birds
 {
		
	void fly()
	{
	    System.out.println("i am flying");
	}
}
class Animal2
{
	void eat()
    {
		System.out.println("i am eating");
    }
}
class Main
{

	public static void main(String [] args)
	{
		Animal2 buzo=new Animal2 ();
		buzo.eat();
		
		
		Birds crow=new Birds ();
		crow.fly();
	}			
}

	
    