////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       07/08/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 8.16  --  RATIONAL NUMBERS

/*

8.16 (Rational Numbers)

Create a class called Rational for performing arithmetic with fractions.
Write a program to test your class.

Use integer variables to represent the private instance variables of the class—
the numerator and the denominator.

Provide a constructor that enables an object of this class to be initialized when
it’s declared. The constructor should store the fraction in reduced form.

The fraction 2/4 is equivalent to 1/2 and would be stored in the object as 1 in
the numerator and 2 in the denominator.

Provide a no-argument constructor with default values in case no initializers
are provided.

Provide public methods that perform each of the following operations:

Add two Rational numbers:
							The result of the addition should be stored in reduced
							form. Implement this as a static method.

Subtract two Rational numbers:
								The result of the subtraction should be stored in
								reduced form. Implement this as a static method.

Multiply two Rational numbers:
								The result of the multiplication should be stored
								in reduced form. Implement this as a static method.

Divide two Rational numbers:
								The result of the division should be stored in
								reduced form. Implement this as a static method.

Return a String representation of a Rational number in the form a/b, where a is
the numerator and b is the denominator.

Return a String representation of a Rational number in floating-point format.
(Consider providing formatting capabilities that enable the user of the class to
specify the number of digits of precision to the right of the decimal point.)

*/

public class RationalTest
{
	public static void main(String args[])
	{
		// CREATE 2 NEW RATIONAL OBJECTS
		Rational r1 = new Rational(25, 50);
		Rational r2 = new Rational(75, 100);
		Rational r3 = new Rational();

		// DISPLAY OUR RATIONAL OBJECTS FOR USER TO SEE
		System.out.printf(" \t\t RATIONAL NUMBER 1 \t   \t RATIONAL NUMBER 2 \n");
		System.out.printf(" \t\t\t %d \t\t\t\t %d \n", r1.numer(), r2.numer());
		System.out.printf(" \t\t _________________ \t & \t _________________ \n");
		System.out.printf(" \t\t\t %d \t\t\t\t %d \n", r1.denom(), r2.denom());
		System.out.printf("\n\n\n\n");

		// ADD r1 + r2
		System.out.printf("ADD: \t RATIONAL NUMBER 1 + RATIONAL NUMBER 2 = RATIONAL NUMBER 3\n\n");
		r3 = r1.add(r2);

		// DISPLAY OUR RATIONAL OBJECTS FOR USER TO SEE
		System.out.printf(" \t\t\t\t RATIONAL NUMBER 3 \n");
		System.out.printf(" \t\t\t\t\t %d \n", r3.numer());
		System.out.printf(" \t\t\t\t _________________ \n");
		System.out.printf(" \t\t\t\t\t %d \n", r3.denom());
		System.out.printf("\n\n\n\n\n");

		// SUBTRACT r1 - r2
		System.out.printf("SUBTRACT: \t RATIONAL NUMBER 1 - RATIONAL NUMBER 2 = RATIONAL NUMBER 3\n\n");
		r3 = r1.subtract(r2);


		// DISPLAY OUR RATIONAL OBJECTS FOR USER TO SEE
		System.out.printf(" \t\t\t\t RATIONAL NUMBER 3 \n");
		System.out.printf(" \t\t\t\t\t %d \n", r3.numer());
		System.out.printf(" \t\t\t\t _________________ \n");
		System.out.printf(" \t\t\t\t\t %d \n", r3.denom());
		System.out.printf("\n\n\n\n\n");

		// MULTIPLY r1 * r2
		System.out.printf("MULTIPLY: \t RATIONAL NUMBER 1 * RATIONAL NUMBER 2 = RATIONAL NUMBER 3\n\n");
		r3 = r1.multiply(r2);

		// DISPLAY OUR RATIONAL OBJECTS FOR USER TO SEE
		System.out.printf(" \t\t\t\t RATIONAL NUMBER 3 \n");
		System.out.printf(" \t\t\t\t\t %d \n", r3.numer());
		System.out.printf(" \t\t\t\t _________________ \n");
		System.out.printf(" \t\t\t\t\t %d \n", r3.denom());
		System.out.printf("\n\n\n\n\n");

		// DIVIDE r1 / r2
		System.out.printf("DIVIDE: \t RATIONAL NUMBER 1 / RATIONAL NUMBER 2 = RATIONAL NUMBER 3\n\n");
		r3 = r1.divide(r2);

		// DISPLAY OUR RATIONAL OBJECTS FOR USER TO SEE
		System.out.printf(" \t\t\t\t RATIONAL NUMBER 3 \n");
		System.out.printf(" \t\t\t\t\t %d \n", r3.numer());
		System.out.printf(" \t\t\t\t _________________ \n");
		System.out.printf(" \t\t\t\t\t %d \n", r3.denom());
		System.out.printf("\n\n\n\n\n");
	}
}