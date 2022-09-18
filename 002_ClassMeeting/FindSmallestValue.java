///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       05/27/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class FindSmallestValue   // 5.11_FindSmallestValue
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int smallest = 0;
		int number = 0;
		
		System.out.print("Enter number of integers: ");
		int integers = input.nextInt();
		
		for (int i = 1; i <= integers; i++)
		{
		    System.out.print("Enter integer: ");
		    number = input.nextInt();
		    if (i == 1)
		    {
		        smallest = number;
		    }
		    else if (number < smallest)
		    {
		        smallest = number;
		    }
		}
		System.out.printf("smallest integer is: %d%n", smallest);
		input.close();
	}
}

