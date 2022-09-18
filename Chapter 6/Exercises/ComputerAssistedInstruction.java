////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/25/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 6.35 / 6.36  --  COMPUTER-ASSISTED INSTRUCTION / REDUCING FATIGUE

/* DESCRIPTION:

6.35 (Computer-Assisted Instruction)

The use of computers in education is referred to as computer-assisted
instruction (CAI). Write a program that will help an elementary school
student learn multiplication. Use a SecureRandom object to produce two
positive one-digit integers. The program should then prompt the user with
a question, such as:

"How much is 6 times 7?"

The student then inputs the answer. Next, the program checks the student’s
answer. If it’s correct, display the message "Very good!" and ask another
multiplication question. If the answer is wrong, display the message "No.
Please try again." and let the student try the same question repeatedly until
the student finally gets it right. A separate method should be used to generate
each new question. This method should be called once when the application begins
execution and each time the user answers the question correctly.

////////////////////////////////////////////////////////////////////////////////

6.36 (Computer-Assisted Instruction: Reducing Student Fatigue)

One problem in CAI environments is student fatigue. This can be reduced by
varying the computer’s responses to hold the student’s attention. Modify the
program of Exercise 6.35 so that various comments are displayed for each answer
as follows:


Possible responses to a correct answer:

Very good!
Excellent!
Nice work!
Keep up the good work!


Possible responses to an incorrect answer:

No. Please try again.
Wrong. Try once more.
Don’t give up!
No. Keep trying.


Use random-number generation to choose a number from 1 to 4 that will be used
to select one of the four appropriate responses to each correct or incorrect
answer. Use a switch statement to issue the responses.

*/

////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction
{
	// CREATE SECURE RANDOM NUMBER GENERATOR
	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String args[])
	{
		menu();
	}

	public static void menu()
	{
		// CREATE INPUT SCANNER OBJECT
		Scanner input = new Scanner(System.in);

		// DEFINE MENU SELECTION VARIABLE
		int choice = 0;

		// PRESENT MENU TO USER AND WAIT FOR INPUT
		while (choice < 1 || choice > 4)	// REPEAT MENU UNTIL VALID CHOICE IS MADE
		{
			System.out.println("################################################");
			System.out.printf("#    MARK'S MULTIPLICATION PRACTICE PROGRAM    #\n");
			System.out.println("################################################");
			System.out.println("[1] \t EASY \t\t (1-10)");
			System.out.println("[2] \t MEDIUM \t (1-100)");
			System.out.println("[3] \t HARD \t\t (1-1000)");
			System.out.println("[4] \t EXIT ");
			System.out.println();
			System.out.print("CHOOSE AN OPTION: ");

			choice = input.nextInt();
			System.out.println();
		}
		
		// PROCEED TO DESIGNATED METHOD
		switch(choice)
		{
		case 1:	// EASY
			askMultiplicationQuestion(1, 10);
			break;
		case 2:	// MEDIUM
			askMultiplicationQuestion(1, 100);
			break;
		case 3:	// HARD
			askMultiplicationQuestion(1, 1000);
			break;
		case 4:	// EXIT
			break;
		}
	}

	public static void askMultiplicationQuestion(int rndLow, int rndHigh)
	{
		// CREATE INPUT SCANNER OBJECT
		Scanner input = new Scanner(System.in);

		// GENERATE TWO RANDOM NUMBERS
		int a = rndLow + randomNumbers.nextInt(rndHigh);
		int b = rndLow + randomNumbers.nextInt(rndHigh);

		// ASK PRACTICE QUESTION
		if (a <= 9 && b <= 9) // 2 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t\t\t\t: ", a, b);

		else if (a >= 10 && a <= 99 && b <= 9) // 3 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t\t\t: ", a, b);

		else if (a <= 9 && b >= 10 && b <= 99) // 3 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t\t\t: ", a, b);

		else if (a >= 10 && a <= 99 && b >= 10 && b <= 99) // 4 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t\t\t: ", a, b);

		else if (a >= 100 && a <= 999 && b >= 10 && b <= 99) // 5 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t\t\t: ", a, b);

		else if (a >= 10 && a <= 99 && b >= 100 && b <= 999) // 5 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t\t\t: ", a, b);

		else if (a >= 100 && a <= 999 && b >= 100 && b <= 999) // 6 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t\t\t: ", a, b);

		else if (a >= 100 && a <= 999 && b >= 1000 && b <= 9999) // 7 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t: ", a, b);

		else if (a >= 1000 && a <= 9999 && b >= 100 && b <= 999) // 7 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t: ", a, b);

		else if (a >= 1000 && a <= 9999 && b >= 1000 && b <= 9999) // 8 DIGITS TOTAL
			System.out.printf("\tWhat is %d x %d ?\t: ", a, b);

		// TAKE RESPONSE FROM USER
		int answer = input.nextInt();

		// CHECK ANSWER AND RESPOND
		if (answer == a * b)
			correctResponse();
		else
			wrongResponse();

		// RETURN TO MENU
		menu();
	}

	public static void correctResponse()
	{
		// GENERATE A RANDOM NUMBER
		int rnd = 1 + randomNumbers.nextInt(4);

		// CHOOSE RESPONSE BASED ON RANDOMLY GENERATED NUMBER
		switch(rnd)
		{
		case 1:
			System.out.printf("\t\t\t\t\t\t  CORRECT!  --  Very good!\n\n");
			break;
		case 2:
			System.out.printf("\t\t\t\t\t\t  CORRECT!  --  Excellent!\n\n");
			break;
		case 3:
			System.out.printf("\t\t\t\t\t\t  CORRECT!  --  Nice work!\n\n");
			break;
		case 4:
			System.out.printf("\t\t\t\t\t\t  CORRECT!  --  Keep up the good work!\n\n");
			break;
		}
	}

	public static void wrongResponse()
	{
		// GENERATE A RANDOM NUMBER
		int rnd = 1 + randomNumbers.nextInt(4);

		// CHOOSE RESPONSE BASED ON RANDOMLY GENERATED NUMBER
		switch (rnd)
		{
		case 1:
			System.out.printf("\t\t\t\t\t\t  WRONG!  --  Please try again!\n\n");
			break;
		case 2:
			System.out.printf("\t\t\t\t\t\t  WRONG!  --  Try once more!\n\n");
			break;
		case 3:
			System.out.printf("\t\t\t\t\t\t  WRONG!  --  Don't give up!\n\n");
			break;
		case 4:
			System.out.printf("\t\t\t\t\t\t  WRONG!  --  Keep trying!\n\n");
			break;
		}
	}
}