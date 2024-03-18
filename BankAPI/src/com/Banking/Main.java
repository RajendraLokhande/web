/*
 * package com.Banking;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Scanner;
 * 
 * class Accounts {
 * 
 * 
 * Scanner sc=new Scanner(System.in);
 * 
 * static ArrayList<Accounts>al=new ArrayList<>();
 * 
 * String accono; String accoHolName; int accountBalance;
 * 
 * // ArrayList<Accounts> a1;
 * 
 * 
 * Accounts(String Accno, String AccoHolName, int AccountBanlance) {
 * this.accono=accono; this.accoHolName=AccoHolName;
 * this.accountBalance=accountBalance;
 * 
 * 
 * }
 * 
 * // public Accounts() {
 * 
 * // }
 * 
 * public static void displayAddAccounts() {
 * 
 * Accounts ac1=new Accounts("8877", "rajendra",1000); Accounts ac2=new
 * Accounts("9757", "rudra", 2000); Accounts ac3=new Accounts("3688", "ramesh",
 * 3000); Accounts ac4=new Accounts("1338", "rajesh", 4000); Accounts ac5=new
 * Accounts("1426", "rakesh", 5000); Accounts ac6=new Accounts("2329", "rajeev",
 * 6000); Accounts ac7=new Accounts("5645", "ravi", 7000); Accounts ac8=new
 * Accounts("2376", "rampal", 8000); Accounts ac9=new Accounts("2584", "ranjit",
 * 6500); Accounts ac10=new Accounts("8980","raghav", 5500);
 * 
 * al.add(ac1); al.add(ac2); al.add(ac3); al.add(ac4); al.add(ac5); al.add(ac6);
 * al.add(ac7); al.add(ac8); al.add(ac9); al.add(ac10);
 * 
 * System.out.println(al); }
 * 
 * public void displayAllAccounts() {
 * 
 * for(int i=0; i<al.size();i++) {
 * System.out.println("Account Number : "+al.get(i).accono);
 * System.out.println("AccountHolder Name : "+al.get(i).accoHolName);
 * System.out.println("Account Balance : "+al.get(i).accountBalance);
 * System.out.println("-----------------------------"); }
 * System.out.println(al.size()); }
 * 
 * public void creditBalance() {
 * 
 * 
 * 
 * System.out.println("Enter Account Number"); String accountNo=sc.nextLine();
 * 
 * accountNo System.out.println("Enter credit Amount"); int
 * creditBalance=sc.nextInt(); sc.nextLine(); for(int i=0; i<al.size();i++) {
 * 
 * (accountNo.eqeals(al.get(i).accountNo))
 * 
 * 
 * 
 * } }
 * 
 * public class Main{
 * 
 * public static void main(String []args) { Scanner sc=new Scanner(System.in);
 * System.out.println("Enter the options:");
 * 
 * 
 * 
 * int options=sc.nextInt();
 * 
 * switch (options) {
 * 
 * case 1:Accounts.displayAddAccounts();
 * //System.out.println("New Add Account"); break; case 2:
 * System.out.println("Credit Balance"); break; case 3:
 * System.out.println("Debit Balance "); break; case 4:
 * System.out.println(" Transfer Balance"); break; case 5:
 * System.out.println("Display Balance "); break; case 6:
 * System.out.println("Display All Accounts"); break; case 7:
 * System.out.println("Exit"); break; default :
 * System.out.println("invalid Account"); break; }
 * 
 * System.out.println("---------------------------------"); }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 */