///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       05/27/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

public class TrianglePrintingProgram   // 5.15_TrianglePrintingProgram
{
	public static void main(String[] args)
	{
	    int row, column, space;
	    
	    // PART A
	    for (row = 1; row <= 10; row++)
	    {
	        for (column = 1; column <= row; column++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	    // SKIP A LINE
	    System.out.println();
	    
	    // PART C
	    for (row = 10; row >= 1; row--)
	    {
	        for (space = 10; space > row; space--)
	        {
	            System.out.print(" ");
	        }
	        for (column = 1; column <= row; column++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	}
}
