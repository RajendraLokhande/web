package in.animal;

public class Animal {

	String color; //by using reference variabale -
	                 //value  , geting object'S value
	int age;
	
	void initObj(String c, int a) 
	
	{
		color=c;
		age= a;
	}
	
	void display() 
	{
		System.out.println(color+ " "+ age);
	}
	
	public static void main(String[] args) {
		
		Animal buzo = new Animal();
		buzo.initObj("Black", 20);
		buzo.display();
		
	//	buzo.color="Black";
	//	buzo.age=5;
		
//		System.out.println(buzo.color+" "+buzo.age);

	}

}
