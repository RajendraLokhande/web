package in.raj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		
		
//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(12);
//		list.add(8);
//		list.add(6);
		
//		System.out.println(list);
		
//		Collections.sort(list);
//		System.out.println(list);
//		
		
			ArrayList <Employee> al=new ArrayList<>();
			//Employee emp=new Employee();
			
		    al.add(new Employee(104,"Raj",5000.00));
			al.add(new Employee(103,"Pandit",1000.00));
			al.add(new Employee(101,"Arav",2000.00));
			al.add(new Employee(102,"Somnath",3000.00));

			
//			System.out.println(al);
//			
//			Collections.sort(al);
//			
//			System.out.println(al);
			
			List<Employee> list = new ArrayList<Employee>(al);
			System.out.println(list);
			
			Collections.sort(list,new SortByName());
			System.out.println(list);
			
			
			
		
	}
}
