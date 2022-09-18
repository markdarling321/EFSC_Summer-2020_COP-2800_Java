///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/03/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

// CHAPTER 2 EXERCISE 30  --  Separating the Digits in an Integer
/*

 2.30 (Separating the Digits in an Integer)

 Write an application that inputs
one number consisting of five digits from the user, separates the number
into its individual digits and prints the digits separated from one another
by three spaces each. For example, if the user types in the number 42339,
the program should print

4 2 3 3 9

Assume that the user enters the correct number of digits. What happens
when you enter a number with more than five digits? What happens when
you enter a number with fewer than five digits? [Hint: It’s possible to do
this exercise with the techniques you learned in this chapter. You’ll need to
use both division and remainder operations to “pick off ” each digit.]

*/

import java.util.Scanner;					// CLASS SCANNER USED FOR USER INPUT

public class SeparateDigits					// DEFINE METHOD
{
	public static void main(String[] args)	// BEGIN MAIN PROGRAM HERE
    {
		Scanner input = new Scanner(System.in);	// CREATE NEW USER INPUT OBJECT
		
		System.out.print("Enter a 5 digit integer: ");	// ASK USER FOR INPUT
		int num = input.nextInt();				// TAKE USER INPUT
		
		int temp = num;							// COPY NUMBER GIVEN TO TEMP VARIABLE
		
		if (num > 9999 && num < 100000)			// CONFIRM USER ENTERED 5 DIGIT NUMBER
		{
			temp = num / 10000;					// ISOLATE 1st DIGIT
			System.out.printf("%d   ",temp);	// PRINT 1st DIGIT
			num = num % 10000;					// UPDATE NUMBER BEFORE NEXT OPERATION

			temp = num / 1000;					// ISOLATE 2nd DIGIT
			System.out.printf("%d   ",temp);	// PRINT 2nd DIGIT
			num = num % 1000;					// UPDATE NUMBER BEFORE NEXT OPERATION

			temp = num / 100;					// ISOLATE 3rd DIGIT
			System.out.printf("%d   ",temp);	// PRINT 3rd DIGIT
			num = num % 100;					// UPDATE NUMBER BEFORE NEXT OPERATION

			temp = num / 10;					// ISOLATE 4th DIGIT
			System.out.printf("%d   ",temp);	// PRINT 4th DIGIT
			num = num % 10;						// UPDATE NUMBER BEFORE NEXT OPERATION

			temp = num / 1;						// ISOLATE 5th DIGIT
			System.out.printf("%d   ",temp);	// PRINT 5th DIGIT
			num = num % 1;						// UPDATE NUMBER BEFORE NEXT OPERATION
		}
		
		System.out.println();				// SKIP A LINE BEFORE "Press Any Key..."
		input.close();	// CLOSE INPUT STREAM OBJECT TO GET RID OF COMPILER WARNING
	}	
}