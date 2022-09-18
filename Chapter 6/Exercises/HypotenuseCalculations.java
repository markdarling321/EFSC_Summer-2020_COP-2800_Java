////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/25/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 6.15  --  HYPOTENUSE CACLULATIONS

/* DESCRIPTION:

6.15 (Hypotenuse Calculations)

Define a method hypotenuse that calculates the hypotenuse of a right triangle
when the lengths of the other two sides are given. The method should take two
arguments of type double and return the hypotenuse as a double. Incorporate
this method into an application that reads values for side1 and side2 and
performs the calculation with the hypotenuse method. Use Math methods pow and
sqrt to determine the length of the hypotenuse for each of the triangles in
Fig. 6.14 [Note:Class Math also provides method hypot to perform this calculation.]

*/

import java.lang.Math;
import java.util.Scanner;

public class HypotenuseCalculations
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		double a, b;

		System.out.printf("%nEnter SIDE A of right triangle: ");
		a = input.nextDouble();

		System.out.printf("%n%nEnter SIDE B of right triangle: ");
		b = input.nextDouble();

		System.out.printf("%n%nThe HYPOTENUSE of your right triangle is: %f%n%n%n",
						   hypotenuse(a,b)
						 );
		
	}

	public static double hypotenuse(double a, double b)
	{
		double hypotenuse;

		hypotenuse = Math.sqrt( ( Math.pow(a,2) + Math.pow(b,2) ) );

		return hypotenuse;
	}

}