///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/03/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

// CHAPTER 7
// EXERCISE 9
/*

7.9 Consider a two-by-three integer array t.
1. Write a statement that declares and creates t.
2. How many rows does t have?
3. How many columns does t have?
4. How many elements does t have?
5. Write access expressions for all the elements in row 1 of t.
6. Write access expressions for all the elements in column 2 of t.
7. Write a single statement that sets the element of t in row 0 and
column 1 to zero.
8. Write individual statements to initialize each element of t to
zero.
9. Write a nested for statement that initializes each element of t to
zero.
10. Write a nested for statement that inputs the values for the
elements of t from the user.
11. Write a series of statements that determines and displays the
smallest value in t.
12. Write a single printf statement that displays the elements of
the first row of t.
13. Write a statement that totals the elements of the third column of
t. Do not use iteration.
14. Write a series of statements that displays the contents of t in
tabular format. List the column indices as headings across the
top, and list the row indices at the left of each row.

*/

import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {        
        Scanner input = new Scanner(System.in);
        //a
        int[][] t = new int[2][3];

        //g
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        //i
        for (int j = 0; j < t.length; j++)
        {
            for (int k = 0; k < t[j].length; k++)
            {
                t[j][k] = 0;
            }
        }

        //j
        for (int j = 0; j < t.length; j++)
        {
            for (int k = 0; k < t[j].length; k++)
            {
                t[j][k] = input.nextInt();
            }
        }

        //k
        int small = t[0][0];
        for (int j = 0; j < t.length; j++)
        {
            for (int k = 0; k < t[j].length; k++)
            {
                if (t[j][k] < small)
                {
                    small = t[j][k];
                }
            }
        }
        System.out.print(small);

        //l
        System.out.printf("%d %d %d\n", t[0][0], t[0][1], t[0][2]);

        //m
        int total = t[0][2] + t[1][2];

        //n
        System.out.println("\t0\t1\t2\n");
        for (int e = 0; e < t.length; e++)
        {
            System.out.print(e);
            for (int r = 0; r < t[e].length; r++)
            {
                System.out.printf("\t%d", t[e][r]);
            }
            System.out.println();
		}
		input.close();
    }
}