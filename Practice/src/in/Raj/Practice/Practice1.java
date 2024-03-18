package in.Raj.Practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		Practice1 practice1 = new Practice1();
	
		practice1.arithmaticOperation();
	}
	
	public void arithmaticOperation() {
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the Option:");
		a=sc.nextInt();
		if(a==1) {
			System.out.println("please enter acc number:");
			System.out.println("please enter transfer amt:");
		}else if (a==2) {
			System.out.println("please enter acc number:");
			System.out.println("your currunt bal is:");
		}else{
			System.out.println("Invalid Option..11");
		}
		
		
//		System.out.println("please enter the value of a");
//		b=sc.nextInt();
//		
//		c=a+b;
//		System.out.println("Addition of a+b="+c);
	}

}
