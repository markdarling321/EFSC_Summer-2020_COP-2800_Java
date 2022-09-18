///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       05/20/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Calculate
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.printf("%nSum is %d%n", (num1 + num2));
        System.out.printf("%nProduct is %d%n", (num1 * num2));
        System.out.printf("%nDifference is %d%n", (num1 - num2));
		System.out.printf("%nQuotient is %d%n", (num1 / num2));
		
		input.close();
    }
}