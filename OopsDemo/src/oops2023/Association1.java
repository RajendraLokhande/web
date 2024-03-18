package oops2023;


class Person
{
	String name;
	String city;
	
	Passport pass;
	
	Person(String name1, String city1, Passport pass1)
	{
		name=name1;
		city=city1;
		pass=pass1;	
	}
	
	void showPersonDedails()

	{
	    System.out.println("Name : "+name);
	    System.out.println("City : "+city);
	    System.out.println("Passport Details" );
	    System.out.println("Passport Number : "+pass.number);
	    System.out.println("Passport Validity : "+pass.validity);
		System.out.println("----------------------");

	
	}
		
}
class Passport
{
	String number;
	String validity;
	
	Passport(String number1, String validity1)
	{
		number=number1;
		validity=validity1;
	}
}

public class Association1 {

	public static void main(String[] args) {

		Passport pass1=new Passport("98756", "11-02-2040");
		Person p1=new Person("Rajendra", "Pune", pass1);
	    p1.showPersonDedails();
	    
	    Passport pass2=new Passport("12345", "10-04-2050");
	    Person p2=new Person("Rajesh", "Sangli", pass2);
	    p2.showPersonDedails();
	}

}
