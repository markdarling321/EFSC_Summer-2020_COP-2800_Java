////////////////////////////////////////////////////////////////////////
//  CLASS MEETING 005  --  WEDNESDAY 06/17/20
////////////////////////////////////////////////////////////////////////
//  EXERCISE 3.11  --  Modified Account Class
////////////////////////////////////////////////////////////////////////
//  3.11 (Modified Account Class) Modify class Account (Fig. 3.8 ) to
//  provide a method called withdraw that withdraws money from an
//  Account. Ensure that the withdrawal amount does not exceed the
//  Account’s balance. If it does, the balance should be left unchanged
//  and the method should print a message indicating "Withdrawal amount
//  exceeded account balance." Modify class AccountTest
//  (Fig. 3.9 ) to test method withdraw.
////////////////////////////////////////////////////////////////////////

public class Account		// EXERCISE 3.11 -- Modified Account Class
{
	private String name;
	private double balance;

	public Account(String n, double b)
	{
		name = n;
		if (b > 0.0)
		{
			balance = b;
		}
	}

	public void deposit (double depAmount)
	{
		if (depAmount > 0.0)
		{
			balance = balance + depAmount;
		}
	}

	public void withdraw(double withdrawalAmount)
	{
		if (withdrawalAmount > balance)
		{
			System.out.println("    ERROR:  WITHDRAWAL AMOUNT EXCEEDED BALANCE!");
		}
		if (withdrawalAmount <= balance)
		{
			balance = balance - withdrawalAmount;
		}
	}

	public double getBalance()
	{
		return balance;
	}

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}
}