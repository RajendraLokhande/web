package com.EncapsDemo;

class Account
{
	private int amount;
	private String accno;

	
	public void setAmount(int amount)
	{
		this.amount=amount;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public void setAccno(String accno)
	{
		this.accno=accno;
	}
	public String getAccno()
	{
		return accno;
	}
	
class BankFunctions
{

	void deposit(Account acc, int dptamt)
	{
		int total=acc.getAmount()+dptamt;
		acc.setAmount(total);
	}
	
	void withdraw(Account acc, int withamt)
	{
		int total=acc.getAmount()-withamt;
		acc.setAmount(total);
	}
}
	
public class EncapsuDemo2 {
	
	
	public static void main(String[] args) {
		
		Account ob1=new Account ();
		ob1.setAccno("11111");
		ob1.setAmount(10000);
		
		BankFunctions bf=new BankFunctions();
		bf.deposit(ob1, 5000);
		bf.withdraw(ob1, 3000);
		
		
		System.out.println("Full Details: "+ob1.getAccno()+" : "+ob1.getAmount());
	}

	}

}
