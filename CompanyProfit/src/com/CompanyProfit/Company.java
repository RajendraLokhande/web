package com.CompanyProfit;

import java.util.ArrayList;
import java.util.Scanner;

public class Company{
	
	Scanner sc=new Scanner (System.in);
	
	ArrayList al=new ArrayList();
	
	
	int profit;
	String comName;
	String address;
	

	public Company() {
		
	}
		
public Company(Scanner sc, int profit, String comName, String address) {
		
	
		this.profit = profit;
		this.comName = comName;
		this.address = address;
		
	}


public void addTotalMonthsProfit() {
		
	purchase p1=new purchase("month", "jan", 514310);
	purchase p2=new purchase("month", "Feb", 783600);
	purchase p3=new purchase("month", "Mar", 923550);
	purchase p4=new purchase("month", "Apr", 116660);
	purchase p5=new purchase("month", "May", 887930);
	purchase p6=new purchase("month", "Jun", 929540);
	purchase p7=new purchase("month", "Jul", 441380);
	purchase p8=new purchase("month", "Aug", 210950);
	purchase p9=new purchase("month", "Sep", 247190);
	purchase p10=new purchase("month", "Oct", 675300);
	purchase p11=new purchase("month", "Nov", 473010);
	purchase p12=new purchase("month", "Dec", 994850);
	
	 
    al.add(p1);
    al.add(p2);
    al.add(p3);
    al.add(p4);
    al.add(p5);
    al.add(p6);
    al.add(p7);
    al.add(p8);
    al.add(p9);
    al.add(p10);
    al.add(p11);
    al.add(p12);

    System.out.println(al);

    System.out.println("Purchases added Successful");

}


void displayLowerProfitsMonth() {
	
	
	System.out.println("Company Profit :"+profit);
	System.out.println("Company Company Name :"+comName);
	System.out.println("Company Address :"+address);
	
  
    System.out.println(al);
	
}
		
void showHighestProfitAndLowestProfit() {
	
	
	
	
}
	
class purchase
{

	public purchase(String string, String string2, int i) {
	}
	
}
	
public static void main(String[] args) {

		
	}

}
