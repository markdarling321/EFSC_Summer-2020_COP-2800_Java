////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/24/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 5.12  --  CALCULATING THE PRODUCT OF ODD INTEGERS

/* DESCRIPTION:
5.12 (Calculating the Product of Odd Integers)

Write an application that calculates the product
of the odd integers from 1 to 15.

*/

public class ProductOddIntegers
{
	public static void main(String args[])
	{
		int sum = 0, product = 1;
		for (int i = 1; i <= 15; i++)
		{
			if (i % 2 != 0) // IF NOTE EVENLY DIVISIBLE BY 2, THE NUMBER IS ODD
			{
				sum += i;
				product = product * i;
			}

		}
		System.out.printf("The sum of the odd integers from 1 to 15 is: %d%n", sum);
		System.out.printf("The product of the odd integers from 1 to 15 is: %d%n", product);
	}
}