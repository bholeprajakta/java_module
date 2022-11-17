import java.util.*;
class BankAccount
{
	private int accno;
	private double balance;
	
	double get()
	{
		return balance;
	}
	
	BankAccount(int accno,double balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	
	void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println("Succefully withdraw amount of rs "+amount);
	}
	void deposite(int amount)
	{
		balance=balance+amount;
		System.out.println("Succefully deposite amount of rs "+amount);
	}
	void show()
	{
		System.out.println("your account number:"+accno);
		System.out.println("your account balance:"+balance);
	}
}

class Que2 
{
	public static void main(String args[])
	{
		int amount;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the account number:");		
		int accountno=sc.nextInt();
		System.out.println("Enter the 1st bank balance:");		
		int balance=sc.nextInt();
		
		BankAccount Customer1= new BankAccount(accountno,balance);
		
		while(true)
		{
		System.out.println("=================================");
		System.out.println("Bank Application");	
		System.out.println("1.Amount withdraw");	
		System.out.println("2.Amount deposite");	
		System.out.println("3.Show balance");	
		System.out.println("4.Exit");	
		
		System.out.println("choose one number:");
		int no=sc.nextInt();		
		
		if (no==4)
		{
			break;
		}
		switch(no)
		{
			case 1:
				System.out.println("Enter the amount you want to withdraw:");		
				amount=sc.nextInt();
				try
				{					
				if(Customer1.get()<amount)
					throw new Exception("balance insufficient");
				else
					Customer1.withdraw(amount);
				}
				catch(Exception e)
				{
					System.out.println(e);
					System.out.println("Insufficient balance...please enter amount greater than balance");
				}
				break;
				
			case 2:
				System.out.println("Enter the amount you want to deposite:");		
				amount=sc.nextInt();
				Customer1.deposite(amount);
				break;
				
			case 3:
				Customer1.show();
				break;
				
			case 4:				
				break;
		}	
				
		}		
	}
}