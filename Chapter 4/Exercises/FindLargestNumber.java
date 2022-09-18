////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/07/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 4.21  --  FIND THE LARGEST NUMBER
/* DESCRIPTION:

The process of finding the largest value is used frequently in computer applications.
For example, a program that determines the winner of a sales contest would input the
number of units sold by each salesperson. The salesperson who sells the most units
wins the contest. Write a pseudocode program, then a Java application that inputs a
series of 10 integers and determines and prints the largest integer. Your program
should use at least the following three variables:

counter: 	A counter to count to 10 (i.e., to keep track of how many numbers have
			been input and to determine when all 10 numbers have been processed).

number:		The integer most recently input by the user.

largest: 	The largest number found so far.

*/

// PSEUDO CODE
/*
	DETERMINE NUMBER OF SALESPEOPLE IN CONTEST;

	DETERMINE NUMBER OF WEEKS UNITS SOLD WERE TRACKED FOR CONTEST;
	
	FOR EACH SALESPERSON:
		TAKE IN NUMBER OF UNITS SOLD FOR EACH SALESPERSON FOR EACH WEEK;
	
	DETERMINE SALESPERSON WHO SOLD THE MOST UNITS OVERALL;

	DISPLAY RESULTS TO SCREEN;
*/

import java.util.Scanner;		// REQUIRED FOR USER INPUT

public class FindLargestNumber	// EXERCISE 4.21  --  FIND THE LARGEST NUMBER
{
	public static void main(String[] args)	// BEGIN MAIN PROGRAM HERE
	{
		// CREATE INPUT STREAM OBJECT
		Scanner input = new Scanner(System.in);
		
		// INITIALIZE VARIABLES
		int largest = 0;		// STORES VALUE OF LARGEST NUMBER FOUND SO FAR
		
		int number = 0;			// HOLDS NUMBER MOST RECENTLY INPUT BY USER
		
		//int counter = 0;		// COUNTER TO KEEP TRACK OF NUMBER OF ITERATIONS
								// WHILE TAKING IN USER INPUT VALUES

		//int dataArray[][][];	// 3-DIMENSIONAL ARRAY THAT STORES THE FOLLOWING:
								// [ SALES PERSON ]  [ WEEK NUMBER ]  [ UNITS SOLD ]

		int[] winArray = new int[3];	// STATIC ARRAY OF LENGTH: 3
										// INDEX [0]  --  WINNING SALESPERSON
										// INDEX [1]  --  WEEK WITH HIGHEST SALES
										// INDEX [2]  --  UNITS SOLD ON HIGHEST WEEK

		// DETERMINE NUMBER OF SALES PEOPLE
		System.out.print("Enter number of salespeople: ");
		int numSalesPeople = input.nextInt();

		// SKIP A LINE
		System.out.println();

		// DETERMINE NUMBER OF WEEKS SALES CONTEST WAS TRACKED FOR
		System.out.print("Enter number of weeks the contest was active: ");
		int numWeeks = input.nextInt();

		// SKIP TWO LINES
		System.out.println();
		System.out.println();

		// CREATE DATA ARRAY
		int[][][] dataArray = new int[numSalesPeople][numWeeks][1];
		
		// DETERMINE NUMBER OF UNITS SOLD EACH WEEK FOR EACH SALESPERSON
		for (int sp = 0; sp < numSalesPeople; sp++)		// STARTING WITH FIRST SALES PERSON
		{												// AND GOING UNTIL FINAL SALESPERON
			for (int wk = 0; wk < numWeeks; wk++)		// STARTING ON FIRST WEEK OF CONTEST
			{											// AND GOING UNTIL FINAL WEEK OF CONTEST
				System.out.printf("Enter number of units sold for week %d for salesperson %d: ",
								 (wk+1), (sp+1));
				number = input.nextInt();				// TAKE USER INPUT HERE
				dataArray[sp][wk][0] = number;			// STORE USER INPUT IN CORRECT
			}											// ARRAY LOCATION
		}

		// PROCESS DATA RECEIVED TO DETERMINE SALES CONTEST WINNER
		for (int sp = 0; sp < numSalesPeople; sp++)		// STARTING WITH FIRST SALESPERSON
		{
			for (int wk = 0; wk < numWeeks; wk++)		// STARTING ON THE FIRST WEEK OF CONTEST
			{
				if (dataArray[sp][wk][0] > largest)		// CHECK TO SEE IF UNITS SOLD IS HIGHEST
				{										// COUNT OF UNITS SOLD SO FAR...
					largest = dataArray[sp][wk][0];		// IF TRUE, UPDATE VARIABLE
					winArray[0] = sp+1;					// UPDATE WIINER ARRAY TO BE ABLE TO ID
					winArray[1] = wk+1;					// WINNING SALESPERSON LATER (INDEXES ARE
					winArray[2] = largest;				// LABELED ABOVE AT ARRAY DEFINITION.)
				}
			}
		}

		// SKIP A LINE
		System.out.println();

		// OUTPUT RESULTS OF PROCESSED DATA
		System.out.printf("WINNER:  SALESPERSON #%d SOLD %d UNITS ON WEEK %d%n",
						  winArray[0], winArray[2], winArray[1]);

		// SKIP A LINE
		System.out.println();
		
		// CLOSE INPUT STREAM
		input.close();
	}// END MAIN PROGRAM HERE	
}// END CLASS HERE