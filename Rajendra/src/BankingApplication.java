

public class BankingApplication {
  public static void main(String []args) {
	  Scanner sc=new Scanner (System.in);
      BankAccount bank1 = new BankAccount(cname: "xyz" , cid: "01");
      bank1.showMenu();
  }
} 
class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid){
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount){
	if(amount !=0){	
		balance = balance + amount;
		previousTransaction = amount;
	}

	
 void withdraw(int amount){
	 if (amount !=0) {
		 balance = balance - amount;
		 previousTransaction = - amount;
	 }
 }
 
 void getPreviousTransaction(){
	 if(previousTransaction >0) {
		 System.out.println("Deposited: "+previousTransaction);
	 }
	 else if(previousTransaction <0){ //-50=50 -400=400
		 System.out.println("withdrawn: "+ Math.abs(previousTransaction));
	 }
	 else{
		 System.out.println("No transaction is occured!");
	 }
 } 

	void showMenu(){
		char option = '\0';
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Welcome "+ customerName);
		System.out.println("Your ID is: "+ customerID);
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("c. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do{
			System.out.println("=======================");
			System.out.println("Enter the Option");
			System.out.println("========================");
			option = sc.next().charAt(0);
			Charactor.toUpperCase(option);
			
			swith (option){

	            case 'A':
					System.out.println("================");
					System.out.println("Balance is: "+Balance);
					System.out.println("================");
					System.out.println();
					break;
					
				case 'B':
					System.out.println("==================");
					System.out.println("Enter the amount to deposit");
					System.out.println("===================");
					int amount = sc. nextInt();
					deposit(amount);
					System.out.println();
					break;
					
				case 'C':
					System.out.println("==================");
					System.out.println("Enter the amount to deposit");
					System.out.println("===================");
	                int amount2 = sc.nextInt();
	                withdraw(amount2);
	                System.out.println();
	                break;
	                
				case 'D':
					System.out.println("==================");
					getPreviousTransaction();
					System.out.println("===================");
					System.out.println();
					break;
					
				case'E':
					System.out.println("=================");
					break;
					
				default:
					System.out.println("invalid option please try again");
					break;
					
			}
		}while (option != 'E');
	}
}
	