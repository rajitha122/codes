	class Account
	{
	String name;
	protected double balance;
	Account(String str,double amt)
	{
	name=str;
	balance=amt;
	}
	String getName()
	{
	return name;
	}
	
	double getBalance()
	{
	return balance;
	}
	void deposit(double amt)
	{
	balance +=amt;
	System.out.println("depositing : " +amt);
	}
	void withdraw(double amt)
	{
	balance -=amt;
	System.out.println("withdraw : " +amt);
	}
	}
	
	class SavingAccout extends Account
	{
	double interestRate;
	SavingAccout(String str, double amt ,double rate)
	{
	super(str,amt);
	interestRate=rate;
	}
	
	}
	
	class CheckingAccount extends Account
	
	{
		double overDraft;
		CheckingAccount(String str, double amt)
		{
		super(str,amt);
		}
		
		CheckingAccount(String str, double amt,double draft)
		{
		
		super(str,amt);
		overDraft=draft;
		
		}
		
		void withdraw(double amt)
		{
		
		System.out.println("overdraft amount : " +overDraft);
		if(amt<=balance)
		
		{
		
		balance -=amt;
		System.out.println("withdrwing : " +amt);
		}
		else if((amt>balance)&&(amt>(balance+overDraft)))
		{
		System.out.println("sorry cannot withdraw");
		
		}
		else{
		double result=amt -balance;
		overDraft-=result;
		balance=0;
		System.out.println("withdraw: " +amt);
		System.out.println("current overdraft amount  : " +overDraft);
		}
		}
	}
		
		class AccountTest
	{
		public static void main(String[] arg)
	    {
		
		SavingAccout sAccountobj= new SavingAccout("rajitha" ,1010,4);
		System.out.println("\n saving account details");
		System.out.println("==================================");
		System.out.println(" " +sAccountobj.getName()
		                 +" has initial balance of : " +sAccountobj.getBalance());
						 
						 sAccountobj.deposit(2000);
						 sAccountobj.withdraw(100);
						 System.out.println( " " +sAccountobj.getName()
										+ " at the end of transaction has a balance of : " +sAccountobj.getBalance());
										
										System.out.println("\n checking account details " );
										System.out.println("=====================================");
										CheckingAccount cAccountobj =new CheckingAccount("vaishali" ,200  ,200 );
										System.out.println( " " +cAccountobj.getName()
										+ " has initial balance of : " +cAccountobj.getBalance());
										cAccountobj.deposit(3000);
										cAccountobj.withdraw(1000);
										System.out.println(" " +cAccountobj.getName()
										+ " at the end of transaction has abalance of : " +cAccountobj.getBalance());
		}
										
	}
								
		
		
	
						 
		
		
	
	

