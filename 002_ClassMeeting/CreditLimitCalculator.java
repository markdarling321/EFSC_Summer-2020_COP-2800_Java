///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       05/27/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class CreditLimitCalculator   // 4.18_CreditLimitCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number (or -1 to quit): ");
		int account = input.nextInt();
		
		while (account != -1)
		{
		    System.out.print("Enter Balance: ");
		    double oldBalance = input.nextDouble();
		    System.out.print("Enter Charges: ");
		    double charges = input.nextDouble();
		    System.out.print("Enter Credits: ");
		    double credits = input.nextDouble();
		    System.out.print("Enter Credit Limit: ");
		    double creditLimit = input.nextDouble();
		    
		    double newBalance = oldBalance + charges - credits;
		    System.out.printf("New Balance is $%.2f%n", newBalance);
		    
		    if (newBalance > creditLimit)
		    {
		        System.out.println("CREDIT LIMIT EXCEEDED!");
		    }
		    
		    System.out.print("Enter account number (or -1 to quit): ");
		    account = input.nextInt();
		}
		input.close();
	}
}

