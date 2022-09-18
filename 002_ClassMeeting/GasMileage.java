///////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       05/27/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class GasMileage   // 4.17_GasMileage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles (-1 to quit): ");
        int miles = input.nextInt();

        while (miles != -1)
        {
            System.out.print("Enter gallons: ");
            int gallons = input.nextInt();
            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;

            if (gallons != 0)
            {
                double milesPerGallon = (double) miles / gallons;
                System.out.printf("MPG: %.2f%n", milesPerGallon);
            }

            if (totalGallons != 0)
            {
                double totalMilesPerGallon = (double) totalMiles / totalGallons;
                System.out.printf("Total MPG: %.2f%n", totalMilesPerGallon);
            }

            System.out.print("Enter miles (-1 to quit): ");
            miles = input.nextInt();
		}
		input.close();
    }    
}