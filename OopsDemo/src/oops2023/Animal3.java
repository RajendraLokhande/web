package oops2023;


class Birds1
{
		void fly()
		{
			System.out.println("i am flying");
		}
		
}
class Animal3
{ 
	    void eat()
	    {
	    	System.out.println("i am eating");
	    }
}
class Main1
{
	    public static void main(String[] args)
	    {
	    	
	    	Animal3 buzo=new Animal3 ();
	    	buzo.eat();
	    
	    	Birds1 crow=new Birds1 ();
	        crow.fly();
	    }
    	
}

