package com.Static;


class Employee
{
	int empid;
	String empname;
	static String empcomname="Brainworks";
	
	Employee(int empid1,String empname1)
	
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	void display()
	{
		System.out.println("Employee Details ");
		System.out.println("Employee Id:" + empid);
		System.out.println("Employee Name:" +empname );
		System.out.println("Employee Company Name:"+empcomname);	
	}	



	public class Employee {
  

	public static void main(String[] args) {
		
		Employee e1=new Employee (101, "rajendra");
		Employee e2=new Employee (102, "kiran");
		Employee e3=new Epmloyee (103, "suhas");

		e1.display();
		e2.display();	
		e3.display();
	}
}
}


