////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/28/20
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

public class Rational
{
	// PRIVATE INSTANCE VARIABLES
	private int numer;
	private int denom;
	
	// CONSTRUCTOR WITH NO PARAMETERS
	public Rational()
	{
		numer = 0;
		denom = 0;
	}

	// CONSTRUCTOR WITH ONE PARAMETER
	public Rational(int n)
	{
		numer = n;
		denom = 1;
	}

	// CONSTRUCTOR WITH TWO PARAMETERS (AUTOMATICALLY REDUCES TO LOWEST COMMON DENOMINATOR)
	public Rational(int n, int d)
	{
		int stopAt = 0;
		boolean isNegative = false;

		// IF BOTH NUMERATOR AND DENOMINATOR ARE NEGATIVE,
		// FLIP THEM BOTH TO POSITIVE VALUES
		if (n < 0 && d < 0)
		{
			n = n * (-1);
			d = d * (-1);
			isNegative = false;
		}

		// IF NUMERATOR IS POSITIVE AND DENOMINATOR IS NEGATIVE,
		// MOVE THE NEGATIVE UP TO THE NUMERATOR AND MAKE THE DENOMINATOR POSITIVE
		if (n > 0 && d < 0)
		{
			//n = n * (-1);
			d = d * (-1);
			isNegative = true;
		}

		// IF NUMERATOR IS NEGATIVE AND DENOMINATOR IS POSITIVE,
		// DO NOTHING MORE
		if (n < 0 && d > 0)
		{
			n = n * (-1); // MAKE POSITIVE UNTIL END OF CONSTRUCTOR LOGIC
			isNegative = true;
		}

		// IF NUMERATOR AND DENOMINATOR ARE THE SAME...
		// AND BOTH ARE POSITIVE
		if (n == d && n > 0 && d > 0)
		{
			n = 1;
			d = 1;
			isNegative = false;
		}
		// AND BOTH ARE NEGATIVE
		if (n == d && n < 0 && d < 0)
		{
			//n = n * (-1);
			//d = d * (-1);
			n = 1;
			d = 1;
			isNegative = false;
		}

		// DETERMINE WHETHER NUMERATOR OR DENOMINATOR IS THE LARGEST
		if (n > d)
		{
			stopAt = d;
		} else if (n < d)
		{
			stopAt = n;
		}

		// REDUCE FRACTION TO LOWEST POSSIBLE VALUES
		for (int i = 2; i <= stopAt; i++)
		{
			if (n % i == 0 && d % i == 0) // IF BOTH NUMERATOR AND DENOMINATOR ARE EVENLY DIVISIBLE
			{ // SET THEM EQUAL TO DIVISOR
				n = n / i;
				d = d / i;
				i = 2; 	// RESET STARTING POINT COUNTER EVERY TIME WE MAKE A REDUCTION
						// IN CASE THEIR ARE MULTIPLE REDUCTIONS TO BE MADE
			}
		}

		// FINALIZE RATIONAL NUMBER
		if (isNegative == true)
		{
			n = n * (-1);
			numer = n;
			denom = d;
		} else if (isNegative == false)
		{
			numer = n;
			denom = d;
		}
	}

	// PUBLIC GETTER FUNCTIONS
	public int numer()
	{
		return this.numer;
	}

	public int denom()
	{
		return this.denom;
	}
	
	// PUBLIC ARITHMETIC OPERATION FUNCTIONS
	public Rational add(Rational frac)
	{
		// DECLARE LOCAL VARIABLES
		int n1 = this.numer;
		int d1 = this.denom;
		int n2 = frac.numer;
		int d2 = frac.denom;
		int n3 = 0;
		int d3 = 0;
		int factor1 = 0;
		int factor2 = 0;

		// IF DENOMINATORS ARE EQUAL ADD THE NUMERATORS
		if (d1 == d2)
		{
			n3 = n1 + n2;
			d3 = d1;
		}
		// IF DENOMINATORS ARE NOT EQUAL, FIND A COMMON DENOMINATOR AND
		// MODIFY THE NUMERATORS BY THE SAME FACTOR BEFORE ADDING THE
		// NUMERATORS TOGETHER
		else if (d1 != d2)
		{
			d3 = d1 * d2;
			factor1 = d3 / d1;
			factor2 = d3 / d2;
			n3 = ((n1 * factor1) + (n2 * factor2));
		}

		// CREATE NEW FRACTION OBJECT AND RETURN THE RESULT
		Rational result = new Rational(n3, d3);
		return result;
	}

	public Rational subtract(Rational frac)
	{
		// DECLARE LOCAL VARIABLES
		int n1 = this.numer;
		int d1 = this.denom;
		int n2 = frac.numer;
		int d2 = frac.denom;
		int n3 = 0;
		int d3 = 0;
		int factor1 = 0;
		int factor2 = 0;

		// IF DENOMINATORS ARE EQUAL SUBTRACT THE NUMERATORS
		if (d1 == d2)
		{
			n3 = n1 - n2;
			d3 = d1;
		}
		// IF DENOMINATORS ARE NOT EQUAL, FIND A COMMON DENOMINATOR AND
		// MODIFY THE NUMERATORS BY THE SAME FACTOR BEFORE SUBTRACTING THE
		// NUMERATORS TOGETHER
		else if (d1 != d2)
		{
			d3 = d1 * d2;
			factor1 = d3 / d1;
			factor2 = d3 / d2;
			n3 = ((n1 * factor1) - (n2 * factor2));
		}

		// CREATE NEW FRACTION OBJECT AND RETURN THE RESULT
		Rational result = new Rational(n3, d3);
		return result;
	}

	public Rational multiply(Rational frac)
	{
		// DECLARE LOCAL VARIABLES
		int n1 = this.numer;
		int d1 = this.denom;
		int n2 = frac.numer;
		int d2 = frac.denom;
		int n3 = 0;
		int d3 = 0;

		// MULTIPLY NUMERATORS TOGETHER
		n3 = n1 * n2;

		// MULTIPLY DENOMINATORS TOGETHER
		d3 = d1 * d2;

		// CREATE NEW FRACTION OBJECT AND RETURN THE RESULT
		Rational result = new Rational(n3, d3);
		return result;
	}

	public Rational divide(Rational frac)
	{
		// DECLARE LOCAL VARIABLES
		int n1 = this.numer;
		int d1 = this.denom;
		int n2 = frac.numer;
		int d2 = frac.denom;
		int n3 = 0;
		int d3 = 0;
		
		// INVERT 2ND FRACTION INTO ITS RECIPROCAL
			// USE n3/d3 TO TEMPORARILY STORE RECIPROCAL OF frac
			n3 = d2;
			d3 = n2;
			// RE-ASSIGN RECIPROCAL VALUES TO n2/d2
			n2 = n3;
			d2 = d3;

		// MULTIPLY NUMERATORS TOGETHER
		n3 = n1 * n2;

		// MULTIPLY DENOMINATORS TOGETHER
		d3 = d1 * d2;

		// CREATE NEW FRACTION OBJECT AND RETURN THE RESULT
		Rational result = new Rational(n3, d3);
		return result;
	}
}