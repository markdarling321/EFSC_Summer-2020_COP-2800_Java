////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/07/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 4.30  --  SQUARE OF ASTERISKS
/* DESCRIPTION:

Write an application that prompts the user to enter the size of the side of a
square, then displays a hollow square of that size made of asterisks. Your
program should work for squares of all side lengths between 1 and 20.

*/

import java.util.Scanner; // REQUIRED FOR USER INPUT

public class SquareOfAsterisks
{
	public static void main(String[] args)		// MAIN PROGRAM STARTS HERE
	{
		// CREATE INPUT STREAM OBJECT
		Scanner input = new Scanner(System.in);

		// INITIALIZE VARIABLES
		int size = 0;
		int start = 0;
		int end = 0;

		// TAKE USER INPUT
		System.out.print("Enter a size (1-20) for your square: ");
		size = input.nextInt();
		end = size;

		// SKIP A LINE
		System.out.println();

		// GENERATE SQUARE USING USER'S DESIRED SIZE
		for (int i = 0; i < size; i++) // STARTING FROM TOP ROW,
		{ // MOVING DOWN 1 ROW AT A TIME

			// PRINT CONTINUOUS LINES OF ASTERISKS FOR FIRST AND LAST LINES
			if (i == start || i == end - 1)
			{
				// PRINT A STREAM OF ASTERISKS THE LENGTH OF THE SIZE CHOSEN
				for (int c = start; c < end; c++)
				{
					System.out.print("* ");
				}
			}
			// ONLY PRINT AN ASTERISK IN THE FIRST AND LAST INDEX OF EACH INTERMEDIATE LINE
			else
			{
				// STEP FROM FIRST COLUMN INDEX TO LAST COLUMN INDEX 1 POSITION AT A TIME
				for (int c = start; c < end; c++)
				{
					// ONLY PRINT AN ASTERISK IF FIRST OR LAST POSITION
					if (c == start || c == end - 1)
					{
						System.out.print("* ");
					}
					// OTHERWISE, PRINT BLANK SPACES IN THE MIDDLE COLUMNS
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println(); // SKIP TO NEXT LINE AND CONTINUE PROCESSING SQUARE
		}
		System.out.println();		// SKIP A LINE BEFORE PAKTC
		input.close();		// CLOSE OUTPUT STREAM
	}// END OF MAIN PROGRAM
}// END OF CLASS