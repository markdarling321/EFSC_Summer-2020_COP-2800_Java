////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/28/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 8.6  --  SAVINGS ACCOUNT CLASS

/*

8.6 (Savings Account Class)

Create class SavingsAccount. Use a static variable annualInterestRate to store
the annual interest rate for all account holders. Each object of the class
contains a private instance variable savingsBalance indicating the amount the
saver currently has on deposit.

Provide method calculateMonthlyInterest to calculate the monthly interest by
multiplying the savingsBalance by annualInterestRate divided by 12—this interest
should be added to savings-Balance. Provide a static method modifyInterestRate
that sets the annualInterestRate to a new value.

Write a program to test class SavingsAccount.
Instantiate two savingsAccount objects, saver1 and saver2, with balances of
$2000.00 and $3000.00, respectively.
Set annualInterestRate to 4%, then calculate the monthly interest for each of 12
months and print the new balances for both savers. Next, set the
annualInterestRate to 5%, calculate the next month’s interest and print the new
balances for both savers.

*/

public class SavingsAccount
{
	// STATIC VARIABLES
	// shared, classwide information available to all objects/instances
	static double annualInterestRate; // EX: 1.68 %

	// INSTANCE VARIABLES
	// vary per object/instance
	private double savingsBalance;

	// CONSTRUCTOR WITH NO PARAMETERS
	public SavingsAccount()
	{
		this.savingsBalance = 0.00;
	}

	// CONSTRUCTOR WITH PARAMETERS
	public SavingsAccount(double balance)
	{
		savingsBalance = balance;
	}

	// SET METHODS
	static void setAnnualInterestRate(double intRate)
	{
		annualInterestRate = intRate;
	}

	// GET METHODS
	static double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public double getBalance()
	{
		return savingsBalance;
	}

	// METHODS
	public void calculateMonthlyInterest()
	{
		double monthlyInterest = 0.00;

		monthlyInterest = ((savingsBalance * (annualInterestRate / 100)) / 12);
		
		savingsBalance += monthlyInterest;
	}

	static boolean modifyInterestRate(double intRate)
	{
		// DEFINE AN ARBITRARY VALID RANGE
		if (intRate >= 0.00 && intRate <= 100.00)
		{
			annualInterestRate = intRate;
			return true;
		}
		else
		{
			return false;
		}
	}
}