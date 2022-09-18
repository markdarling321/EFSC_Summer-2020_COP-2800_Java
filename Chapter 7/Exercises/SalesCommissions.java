////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/26/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 7.10  --  SALES COMMISSIONS

/* DESCRIPTION:

7.10 (Sales Commissions)

Use a one-dimensional array to solve the following problem: A company pays its
salespeople on a commission basis. The salespeople receive $200 per week plus 9%
of their gross sales for that week. For example, a salesperson who grosses
$5,000 in sales in a week receives $200 plus 9% of $5,000, or a total of $650.

Write an application (using an array of counters) that determines how many of
the salespeople earned salaries in each of the following ranges (assume that
each salesperson’s salary is truncated to an integer amount):

$200–299			salary[0]

$300–399			salary[1]

$400–499			salary[2]

$500–599			salary[3]

$600–699			salary[4]

$700–799			salary[5]

$800–899			salary[6]

$900–999			salary[7]

$1,000 and over		salary[8]

Summarize the results in tabular format.

*/

////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;	// FOR TAKING USER INPUT

public class SalesCommissions
{
	public static void main(String args[])
	{
		// CREATE SCANNER OBJECT TO TAKE USER INPUT WITH
		Scanner input = new Scanner(System.in);

		// DECLARE CONSTANTS
		final int BASE = 200;
		final double RATE = 0.09;

		// DECLARE VARIABLES
		double total = 0, commission = 0;
		int sales = 0;
		int salary[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		while (sales != -1)
		{
			// TAKE USER INPUT
			System.out.printf("ENTER TOTAL SALES MADE BY AN EMPLOYEE (-1 to stop): ");
			sales = input.nextInt();

			// DETERMINE COMMISSION AND SALARY BASED ON SALES FOR CURRENT SALESPERSON
			commission = sales * RATE;
			total = BASE + commission;

			// DETERMINE WHICH SALES TIER CURRENT SALESPERSON FALLS INTO AND ADD 1 TO ITS TALLY
			if (total >= 200 && total <= 299)
				salary[0] += 1;
			else if (total >= 300 && total <= 399)
				salary[1] += 1;
			else if (total >= 400 && total <= 499)
				salary[2] += 1;
			else if (total >= 500 && total <= 599)
				salary[3] += 1;
			else if (total >= 600 && total <= 699)
				salary[4] += 1;
			else if (total >= 700 && total <= 799)
				salary[5] += 1;
			else if (total >= 800 && total <= 899)
				salary[6] += 1;
			else if (total >= 900 && total <= 999)
				salary[7] += 1;
			else if (total >= 1000)
				salary[8] += 1;
		}

		// OUTPUT RESULTS IN TABLE FORMAT FOR USER TO SEE
		System.out.printf("\n\n");
		System.out.printf("##################################################################\n");
		System.out.printf("# \t SALARY TIER \t SALARY RANGE \t NUMBER OF SALESPEOPLE \t #\n");
		System.out.printf("##################################################################\n");
		System.out.printf("  \t\t [1] \t $200 - $299: \t\t %d\n", salary[0]);
		System.out.printf("  \t\t [2] \t $300 - $399: \t\t %d\n", salary[1]);
		System.out.printf("  \t\t [3] \t $400 - $499: \t\t %d\n", salary[2]);
		System.out.printf("  \t\t [4] \t $500 - $599: \t\t %d\n", salary[3]);
		System.out.printf("  \t\t [5] \t $600 - $699: \t\t %d\n", salary[4]);
		System.out.printf("  \t\t [6] \t $700 - $799: \t\t %d\n", salary[5]);
		System.out.printf("  \t\t [7] \t $800 - $899: \t\t %d\n", salary[6]);
		System.out.printf("  \t\t [8] \t $900 - $999: \t\t %d\n", salary[7]);
		System.out.printf("  \t\t [9] \t $1000 - over: \t\t %d\n", salary[8]);
		System.out.printf("##################################################################\n\n\n");
		input.close();
	}
}