package generics2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsArray1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList();
		
		list.add("Rajesh");
		list.add("Lokhande");
		list.add("Raj");
		System.out.println(list);
		
		List<String> list1 = Arrays.asList("ramesh","deepak");
		
		System.out.println(list1);
	}

}
