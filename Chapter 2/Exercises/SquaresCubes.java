///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/01/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

// 2.31 (Table of Squares and Cubes)
// DESCRIPTION:  Using only the programming techniques you learned in this
//               chapter, write an application that calculates the squares
//               and cubes of the numbers from 0 to 10 and prints the
//               resulting values in table format.

///////////////////////////////////////////////////////////////////////////////
public class SquaresCubes
{
    // main method begins execution of Java application
    public static void main(String[] args)
    {
        // DECLARE VARIABLES
        int num, square, cube;

        // PRINT TABLE HEADING
        System.out.println("number\t\tsquare\t\tcube");

        // PRINT TABLE CONTENTS USING LOOP
        for (int i = 0; i <= 10; i++)
        {
            num = i;
            square = num * num;
            cube = num * num * num;

            System.out.printf("%d\t\t%d\t\t%d\n",num,square,cube);
        }

    } // end method main()
} // end class SquaresCubes