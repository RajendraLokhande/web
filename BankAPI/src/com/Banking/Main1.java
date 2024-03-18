package com.Banking;
import java.util.ArrayList;
import java.util.Scanner;


class Accounts 
{
   
	Scanner sc = new Scanner(System.in);
    
    static ArrayList<Accounts> al = new ArrayList<>();
    
    String accono;
    String accoHolName;
    int accountBalance;
    
    
    public Accounts() {
	
	}
    Accounts(String accono, String accoHolName, int accountBalance) 
    {
        this.accono = accono;
        this.accoHolName = accoHolName;
        this.accountBalance = accountBalance;
    }
   

    public void displayAllAccounts() 
    {
        for (int i = 0; i < al.size(); i++) 
        {
            System.out.println("Account Number: " + al.get(i).accono);
            System.out.println("AccountHolder Name: " + al.get(i).accoHolName);
            System.out.println("Account Balance: " + al.get(i).accountBalance);
            System.out.println("-----------------------------");
        }
        System.out.println("Total number of accounts: " + al.size());
    }
    
    
    public void addNewAccounts() 
    {
        
        Accounts ac1=new Accounts("8877", "rajendra",1000);
		Accounts ac2=new Accounts("9757", "revan",   2000);
	    Accounts ac3=new Accounts("3688", "ramesh",  3000);
		Accounts ac4=new Accounts("1338", "rajesh",  4000);
		Accounts ac5=new Accounts("1426", "rakesh",  5000);
		Accounts ac6=new Accounts("2329", "rajeev",  6000);
		Accounts ac7=new Accounts("5645", "ravi",    7000);
		Accounts ac8=new Accounts("2376", "rampal",  8000);
		Accounts ac9=new Accounts("2584", "ranjit",  6500);
		Accounts ac10=new Accounts("8980","raghav",  5500);
		
		al.add(ac1);
		al.add(ac2);
		al.add(ac3);
		al.add(ac4);
		al.add(ac5);
		al.add(ac6);
		al.add(ac7);
		al.add(ac8);
		al.add(ac9);
		al.add(ac10);
		
		System.out.println(al);
		
		System.out.println("Accounts added successfully");
	    	
	} 

   public void creditBalance() 
    {
        System.out.println("Enter Account Number");
        String accountNo = sc.nextLine();
        
        System.out.println("Enter credit Amount");
        int creditAmount = sc.nextInt();
    
        
        for (int i = 0; i < al.size(); i++) 
        {
            if (accountNo.equals(al.get(i).accono)) 
            {
                al.get(i).accountBalance += creditAmount;
                System.out.println("Credit successful");
            }
        }
       
    }

	public void debitBalance() 
	{
		System.out.println("Enter Account Number");
		String accountNo = sc.next();
		
		System.out.println("Enter debit Amount");
		int debitAmount= sc.nextInt();
		
		for(int i=0; i<al.size(); i++)
		{
			if (accountNo.equals(al.get(i).accono))
			{
			 al.get(i).accountBalance -=debitAmount;
			}
		}
			 
		System.out.println("Dedited successful");
	}
			
							
	public void transferBalance() 
	{
     System.out.println("Enter account Number");
     String accountNo=sc.next();
	
     System.out.println("Enter transfer Amount ");
     int transferAmount=sc.nextInt();
     
     for(int i=0; i<al.size();i++)
     {
    	if(accountNo.equals(al.get(i).accono)) 
    	{
    		al.get(i).accountBalance +=transferAmount;
    	}
     }
    
     System.out.println("Transfered Successfull");
	}

	public void displayBalance() 
	{
     System.out.println("Enter account Number");
     String accountNo=sc.next();
     
     System.out.println("Enter displayBalance");
     int displayBlanace=sc.nextInt();
     
     for(int i=0; i<al.size();i++)
     {
    	 if(al.get(i).equals(accountBalance))
    	 {
    		 System.out.println("your accountBalance is: "+ al.get(i).accountBalance);
    	 }
     }
     
}

}

public class Main1 
{
   	public static void main(String[] args) 
    {
   		
   		Accounts ac= new Accounts();
        Scanner sc = new Scanner(System.in);
     
        ac.addNewAccounts();
        
        while (true) 
        {
        	
        	   System.out.println("press 1 for add ac."+
        	   "press 2 for credit balance."+
        	   "press 3 for debit balance."+
        	   "press 4 for transfer balance."+
        	   "press 5 for display balance."+
        	   "press 6 for dispaly All acounts.");
        	
            System.out.println("Enter the options:");
            int options = sc.nextInt();
            
            
			switch (options) 
            {
                case 1: ac.addNewAccounts();
                        break;
                case 2: ac.creditBalance();
                        break;
                case 3: ac.debitBalance();
                        break;
                case 4: ac.transferBalance();
                        break;
                case 5: ac.displayBalance();
                        break;
                case 6: ac.displayAllAccounts();
                        break;
                
               default: System.out.println("Invalid option");
                        break;
                        
                  
        }
			 System.out.println("------------------------");     
        }
    }
}
