package in.raj;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	int id;
	String name;
	double salary;
	

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}



	






	

}
