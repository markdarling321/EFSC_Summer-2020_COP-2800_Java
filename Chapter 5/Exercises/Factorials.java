////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/25/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 5.13  --  FACTORIALS

/* DESCRIPTION:

5.13 (Factorials)

Factorials are used frequently in probability problems. The factorial of a
positive integer n (written n! and pronounced “n factorial”) is equal to the
product of the positive integers from 1 to n. Write an application that
calculates the factorials of 1 through 20. Use type long. Display the results
in tabular format. What difficulty might prevent you from calculating the
factorial of 100?

*/

public class Factorials
{
	public static void main(String args[]) // BEGIN MAIN PROGRAM HERE
	{
		// DEFINE VARIABLES
		long factorial = 1L;

		// PRINT TABLE HEADING
		System.out.printf("\t#\t\tFACTORIAL%n");

		// PRINT TABLE CONTENTS (DATA)...
		for (int i = 1; i <= 20; i++) // COUNT 1-20 FOR EACH NUMBER WE WANT TO FACTORIALIZE
		{
			System.out.printf("\t%d\t\t", i); // PRINT # COLUMN DATA
			for (int j = 1; j <= i; j++) 			// COUNT 1-i TO OBTAIN EACH
			{							 			// FACTORIAL'S RESULT
				if (j == 1)	// HANDLE SPECIAL CASE FOR 1
					factorial = 1;
				else		// HANDLE ALL OTHER CALCULATION CASES BESIDES 1
					factorial = factorial * j;
			}
			System.out.printf("%d%n", factorial); // PRINT FACTORIAL COLUMN DATA
		}
	} // END MAIN PROGRAM HERE	
} // END CLASS HERE