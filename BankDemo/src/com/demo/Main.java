package com.demo;
import java.util.ArrayList;
import java.util.Scanner;

import com.Banking.Accounts;

class Accounts {
    Scanner sc = new Scanner(System.in);
    
    static ArrayList<Accounts> al = new ArrayList<>();
    
    String accono;
    String accoHolName;
    int accountBalance;
    
    Accounts(String accono, String accoHolName, int accountBalance) {
        this.accono = accono;
        this.accoHolName = accoHolName;
        this.accountBalance = accountBalance;
    }
    
    public static void displayAddAccounts() {
        Accounts ac1 = new Accounts("8877", "rajendra", 1000);
        // Add more accounts as needed...
        
        al.add(ac1);
        // Add more accounts to the ArrayList...
        
        System.out.println("Accounts added successfully!");
    }
    
    public void displayAllAccounts() {
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Account Number: " + al.get(i).accono);
            System.out.println("AccountHolder Name: " + al.get(i).accoHolName);
            System.out.println("Account Balance: " + al.get(i).accountBalance);
            System.out.println("-----------------------------");
        }
        System.out.println("Total number of accounts: " + al.size());
    }
    
    public void creditBalance() {
        System.out.println("Enter Account Number");
        String accountNo = sc.nextLine();
        
        System.out.println("Enter credit Amount");
        int creditAmount = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < al.size(); i++) {
            if (accountNo.equals(al.get(i).accono)) {
                al.get(i).accountBalance += creditAmount;
                System.out.println("Credit successful. Updated balance: " + al.get(i).accountBalance);
                return;
            }
        }
        System.out.println("Account not found!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accounts.displayAddAccounts();
        
        while (true) {
            System.out.println("Enter the options:");
            int options = sc.nextInt();
            
            switch (options) {
            case 1: new Accounts("8877", "rajendra", 1000).displayAllAccounts();
                    break;
            case 2: new Accounts("8877", "rajendra", 1000).creditBalance();
    		        break;
    		case 3: System.out.println("Debit Balance ");
    		        break;
    		case 4: System.out.println(" Transfer Balance");
                    break;
            case 5: System.out.println("Display Balance ");
                    break;
            case 6: System.out.println("Display All Accounts");
                    break;
            case 7: System.out.println("Exit");
                    break;
            default : System.out.println("invalid Account");       
                    break;
    	   }
              
        }
    }
}
