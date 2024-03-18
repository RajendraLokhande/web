package newBankApp;

import java.util.Scanner;



public class Main {
	
public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		
		
		Accounts accounts = new Accounts();
		
		int n=  sc.nextInt();
		
		
		switch(n) {
		
		case 1: System.out.println("create New Account");
		System.out.println("Enter Account no.");
		String ac=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Amount");
		int amount= sc.nextInt();
		 		
				accounts.createAccount(ac,name ,amount);
				break;
		
		}
	

}
}
