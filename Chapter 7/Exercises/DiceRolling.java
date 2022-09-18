////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/26/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 7.17  --  DICE ROLLING

/* DESCRIPTION:

7.17 (Dice Rolling)

Write an application to simulate the rolling of two dice. The application should
use an object of class Random once to roll the first die and again to roll the
second die. The sum of the two values should then be calculated. Each die can
show an integer value from 1 to 6, so the sum of the values will vary from 2 to
12, with 7 being the most frequent sum, and 2 and 12 the least frequent. Figure
7.28 shows the 36 possible combinations of the two dice. Your application should
roll the dice 36,000,000 times. Use a one-dimensional array to tally the number
of times each possible sum appears.

Display the results in tabular format.

					1		2		3		4		5		6		
			 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
			|														|
			|														|
		1	|		2		3		4		5		6		7		|
			|														|
			|														|
		2	|		3		4		5		6		7		8		|
			|														|
			|														|
		3	|		4		5		6		7		8		9		|
			|														|
			|														|
		4	|		5		6		7		8		9		10		|
			|														|
			|														|
		5	|		6		7		8		9		10		11		|
			|														|
			|														|
		6	|		7		8		9		10		11		12		|
			|														|
			|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|

*/

////////////////////////////////////////////////////////////////////////////////

import java.util.Random;

public class DiceRolling
{
	public static void main(String args[])
	{
		// CREATE NEW RANDOM CLASS OBJECT TO OBTAIN RANDOM NUMBERS FROM
		Random rndNum = new Random();

		// DECLARE VARIABLES
		int die1, die2, sum;
		int sample[] =	// EMPTY ARRAY TO HOLD SAMPLE DATA
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		// BEGIN MAIN PROGRAM LOGIC HERE
		System.out.println("Rolling 2 dice 36,000,000 times...");

		// ROLL 2 DICE 36,000,000 TIMES AND STORE THE SAMPLE DATA RESULTS IN ARRAY
		for (int i = 1; i <= 36000000; i++)
		{
			die1 = 1 + rndNum.nextInt(6); // GENERATE RANDOM NUMBER FROM 1 TO 6
			die2 = 1 + rndNum.nextInt(6); // GENERATE RANDOM NUMBER FROM 1 TO 6
			sum = die1 + die2; // TOTAL THE SUM OF THE DICE

			// DETERMINE WHICH SAMPLE CATEGORY CURRENT ROLL FALLS INTO AND ADD 1 TO ITS TALLY
			if (sum == 2)
				sample[0] += 1;
			if (sum == 3)
				sample[1] += 1;
			if (sum == 4)
				sample[2] += 1;
			if (sum == 5)
				sample[3] += 1;
			if (sum == 6)
				sample[4] += 1;
			if (sum == 7)
				sample[5] += 1;
			if (sum == 8)
				sample[6] += 1;
			if (sum == 9)
				sample[7] += 1;
			if (sum == 10)
				sample[8] += 1;
			if (sum == 11)
				sample[9] += 1;
			if (sum == 12)
				sample[10] += 1;
		}
		
		// OUTPUT TABLE OF SAMPLE RESULTS FOR USER TO SEE
		System.out.printf("\n\n");
		System.out.printf(" \t #########################################\n");
		System.out.printf(" \t # \t SUM \t\t SAMPLES \t #\n");
		System.out.printf(" \t #########################################\n");
		System.out.printf(" \t\t 2 \t\t %d\n", sample[0]);
		System.out.printf(" \t\t 3 \t\t %d\n", sample[1]);
		System.out.printf(" \t\t 4 \t\t %d\n", sample[2]);
		System.out.printf(" \t\t 5 \t\t %d\n", sample[3]);
		System.out.printf(" \t\t 6 \t\t %d\n", sample[4]);
		System.out.printf(" \t\t 7 \t\t %d\n", sample[5]);
		System.out.printf(" \t\t 8 \t\t %d\n", sample[6]);
		System.out.printf(" \t\t 9 \t\t %d\n", sample[7]);
		System.out.printf(" \t\t 10 \t\t %d\n", sample[8]);
		System.out.printf(" \t\t 11 \t\t %d\n", sample[9]);
		System.out.printf(" \t\t 12 \t\t %d\n", sample[10]);
		System.out.printf("\n\n");
	}
}