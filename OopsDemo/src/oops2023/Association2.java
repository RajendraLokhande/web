package oops2023;

class Employee
{
	String empid;
	String empname;
	
	Address adr;
	
  
	Employee(String empid1, String empname1, Address adr1)
	
	{
	empid=empid1;
	empname=empname1;
	adr=adr1;
	}

	void showempDetails()
	{
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name :"+empname);
		System.out.println("Employee Address");		
		System.out.println("Location : "+adr.location);
		System.out.println("City : "+adr.city);
	    System.out.println("State  "+adr.state);
		System.out.println("----------------------");

	}	
}
class Address
{
	String location;
	String city;
	String state;
	
	Address(String location1, String city1, String state1)
	{
      location=location1;
      city=city1;
      state=state1; 
	}
}
public class Association2 {

	public static void main(String[] args) {
     
		Address ad1=new Address("#100 sector 2", "pune", "Maharashtra");
		Employee emp1=new Employee("101", "rajendra",ad1);
		emp1.showempDetails();
		
		
		Address ad2=new Address ("#112 sector 1", "satara",  "Maharashtra");
		Employee emp2=new Employee("500", "kiran", ad2);
		emp2.showempDetails();
	}
  }
