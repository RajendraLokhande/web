package com.GroceryBillDemo;

import java.util.Scanner;

public class GroceryBill
{
	
	String product_name;
	double unit_price;
	int stock_qnty;
	double final_bill;
	//double Gst;
	
	public static void main(String []args)
	{
		
		double sugar=55;
		double soap=10;
		double pen=15;
		
		System.out.println("Welcome to new market");
		System.out.println("Following are the Product Range...");
		
		System.out.println("Sugar=Rs."+sugar);
		System.out.println("Soap=Rs."+soap);
		System.out.println("Pen=Rs."+pen);
		
		Scanner sc=new Scanner (System.in);
		System.out.print("please select the qty of sugar=");
		double sugarqty=sc.nextDouble();
		System.out.print("please select the qty of soap=");
		double soapqty=sc.nextDouble();
		System.out.print("please select the qty of pen=");
		double penqty=sc.nextDouble();
		
		double sugarAmt=sugar*sugarqty;
		double soapAmt=soap*sugarqty;
		double penAmt=pen*sugarqty;
		
		double gross=sugarAmt+soapAmt+penAmt;
				
		double gst=gross*5/100;
	    double finalbill=gross+gst;
	    
	    System.out.println("Sugar Quantity="+sugarqty);
	    System.out.println("Soap Quantity="+soapqty);
	    System.out.println("Pen Quantity="+penqty);
	    
	    System.out.println("Gross Bill=="+gross);
	    System.out.println("Gst On Bill=="+gst);
	    System.out.println("Final Bill=="+finalbill);
	    
	    System.out.println("Sr.No| Products Name | Quantity |Unit Price |Gst% |Price");
	    System.out.println("==============================================================================");
	    System.out.println(" 1 |  Sugar | +sugarqty+  | +sugar+ | +sugar*5/100 | +sugarAmt+ ");
	    System.out.println(" 2 | soap   | +soapqty+   | +soap+  | +soap*5/100  |  +soapAmt+ ");
	    System.out.println(" 3 | pen    | +penqty+    | +pen+   | +pen*5/100   |  +penAmt+  ");
	    System.out.println("==============================================================================");
	    System.out.println("----------------------------------------------------Gross Bill="+gross+"------");
	    System.out.println("----------------------------------------------------Gst On Bill="+gst+"-------");
	    System.out.println("----------------------------------------------------Final Bill="+finalbill+"--");
	    System.out.println("==============================================================================");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
