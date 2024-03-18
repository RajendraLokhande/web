package in.collection.Main;

import java.util.Arrays;
import java.util.List;

import in.collection.User.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(102,"Rajendra","Narhe");
		User user2 = new User(103,"Mahadev","Ambegaon");
		User user3 = new User(104,"Prshant","pune");
		
		List<Object> list = Arrays.asList(101,"name","address");
		
		System.out.println(list);
		System.out.println("######################################################");
		
		List<User> list12 = Arrays.asList(user1,user2,user3);
		
		System.out.println(list12);
	}

}
