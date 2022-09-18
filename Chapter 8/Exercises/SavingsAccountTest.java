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

public class SavingsAccountTest
{
	public static void main(String args[])
	{
		// CREATE 2 NEW SavingsAccount OBJECTS
		SavingsAccount saver1 = new SavingsAccount(2000.00); // USES CONSTRUCTOR WITH PARAMETERS
		SavingsAccount saver2 = new SavingsAccount(3000.00); // USES CONSTRUCTOR WITH PARAMETERS
		//SavingsAccount saver3 = new SavingsAccount(); // USES CONSTRUCTOR WITHOUT PARAMETERS


		// SET ANNUAL INTEREST RATE
		SavingsAccount.setAnnualInterestRate(4.00);


		// PRINT BALANCE(S)
		System.out.printf("PRINTING INITIAL ACCOUNT INFO...\n\n");
		System.out.printf(" \t ################################################################################# \n");
		System.out.printf(" \t # \t SAVINGS ACCOUNT \t\t INTEREST RATE \t\t BALANCE \t #\n");
		System.out.printf(" \t ################################################################################# \n");
		System.out.printf(" \t \t saver1 \t\t\t %.3f %% \t\t $%.2f \n",
							SavingsAccount.getAnnualInterestRate(), 
							saver1.getBalance()
		);
		System.out.printf(" \t \t saver2 \t\t\t %.3f %% \t\t $%.2f \n",
							SavingsAccount.getAnnualInterestRate(), 
							saver2.getBalance()
		);
		System.out.printf("\n\n\n");


		// CALCULATE MONTHLY INTEREST
		System.out.printf("CALCULATING MONTHLY INTEREST OF ACCOUNTS...\n\n");
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();


		// PRINT BALANCE(S)
		System.out.printf("PRINTING UPDATED ACCOUNT INFO...\n\n");
		System.out.printf(" \t ################################################################################# \n");
		System.out.printf(" \t # \t SAVINGS ACCOUNT \t\t INTEREST RATE \t\t BALANCE \t #\n");
		System.out.printf(" \t ################################################################################# \n");
		System.out.printf(" \t \t saver1 \t\t\t %.3f %% \t\t $%.2f \n",
							SavingsAccount.getAnnualInterestRate(),
							saver1.getBalance()
		);
		System.out.printf(" \t \t saver2 \t\t\t %.3f %% \t\t $%.2f \n",
							SavingsAccount.getAnnualInterestRate(),
							saver2.getBalance()
		);
		System.out.printf("\n\n\n");

		// UPDATE ANNUAL INTEREST RATE
		SavingsAccount.setAnnualInterestRate(5.00);

		// CALCULATE MONTHLY INTEREST WITH UPDATED RATE
		System.out.printf("CALCULATING MONTHLY INTEREST OF ACCOUNTS USING UPDATED INTEREST RATE...\n\n");
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		// PRINT BALANCE(S)
		System.out.printf("PRINTING UPDATED ACCOUNT INFO...\n\n");
		System.out.printf(" \t ################################################################################# \n");
		System.out.printf(" \t # \t SAVINGS ACCOUNT \t\t INTEREST RATE \t\t BALANCE \t #\n");
		System.out.printf(" \t ################################################################################# \n");
		System.out.printf(" \t \t saver1 \t\t\t %.3f %% \t\t $%.2f \n",
							SavingsAccount.getAnnualInterestRate(),
							saver1.getBalance()
		);
		System.out.printf(" \t \t saver2 \t\t\t %.3f %% \t\t $%.2f \n",
							SavingsAccount.getAnnualInterestRate(),
							saver2.getBalance()
		);
		System.out.printf("\n\n\n");
	}
}