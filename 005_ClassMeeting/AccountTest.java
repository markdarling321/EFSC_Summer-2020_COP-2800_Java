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

import java.util.Scanner;

public class AccountTest		// EXERCISE 3.11 -- Modified Account Class
{
	public static void main(String[] args)
	{
		Account ac1 = new Account("Jane Green", 50.00);
		Account ac2 = new Account("John Bluse", -7.53);

		System.out.printf("\nACCOUNT 1: %s balance: $%.2f%n", ac1.getName(), ac1.getBalance());
		System.out.printf("ACCOUNT 2: %s balance: $%.2f%n", ac2.getName(), ac2.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.print("Enter withdrawal amount for ac1: ");
		double amt1 = input.nextDouble();
		System.out.printf("%n    subtracting %.2f from ac1 balance %n", amt1);
		ac1.withdraw(amt1);

		System.out.printf("\n\nACCOUNT 1: %s balance: $%.2f%n", ac1.getName(), ac1.getBalance());
		System.out.printf("ACCOUNT 2: %s balance: $%.2f%n", ac2.getName(), ac2.getBalance());

		System.out.print("Enter withdrawal amount for ac2: ");
		amt1 = input.nextDouble();
		System.out.printf("%n    subtracting %.2f from ac1 balance %n", amt1);
		ac2.withdraw(amt1);

		System.out.printf("\n\nACCOUNT 1: %s balance: $%.2f%n", ac1.getName(), ac1.getBalance());
		System.out.printf("ACCOUNT 2: %s balance: $%.2f%n", ac2.getName(), ac2.getBalance());

		input.close();
	}
}