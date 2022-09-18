///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/03/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

// CHAPTER 7
// EXERCISE 14

/*

7.14 (Variable-Length Argument List) Write an application that calculates
the product of a series of integers that are passed to method product
using a variable-length argument list. Test your method with several calls,
each with a different number of arguments.

*/
public class VarArgsTest
{
    public static int product(int... numbers)
    {
        int product = 1;
        for (int number : numbers)
        {
            product = product * number;
        }
        return product;
    }

    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %d%n%n", a, b, c, d, e);
        System.out.printf("The product of a and b is: %d%n", product(a, b));
        System.out.printf("The product of a, b, and c is: %d%n", product(a, b, c));
        System.out.printf("The product of a, b, c, and d is: %d%n", product(a, b, c, d));
        System.out.printf("The product of a, b, c, d, and e is: %d%n", product(a, b, c, d, e));
    }

    
}