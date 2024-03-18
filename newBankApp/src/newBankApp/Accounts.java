package newBankApp;

import java.util.ArrayList;
import java.util.List;

class Accounts
{
	String Accono;
	String AccoHolName;
	int accountBalance;
	ArrayList<Accounts> a1= new ArrayList<>();
	
	
	Accounts()
	{
				
	}
	Accounts(String Accno, String AccoHolName, int AccountBanlance)
	{
		this.Accono=Accono;
		this.AccoHolName=AccoHolName;
		this.accountBalance=accountBalance;
	
	}
	
		
	public List<Accounts> createAccount(String Accno, String AccoHolName, int AccountBanlance){
		
		List<Accounts> user= new ArrayList<>();
		
		user.add(new Accounts(Accno, AccoHolName, AccountBanlance));
		
		return user;
		
	}
}

