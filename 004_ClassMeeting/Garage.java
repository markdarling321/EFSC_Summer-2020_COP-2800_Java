// EXERCISE 6.8

import java.util.Scanner;

public class Garage
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double totalReceipts = 0.0;

		System.out.print("Enter number of hours (-1 to quit): ");
		double hours = input.nextDouble();

		while (hours >= 0.0)
		{
			double fee = calculateCharges(hours);
			totalReceipts += fee;
			System.out.printf("Current charge: $%.2f, Total Receipts: $%.2f%n", fee, totalReceipts);
			System.out.print("Enter number of hours (-1 to quit): ");
			hours = input.nextDouble();
		}
		input.close();
	}

	public static double calculateCharges(double hours)
	{
		double charge = 2.0;
		if (hours > 3.0)
		{
			charge = 2.0 + 0.5 * Math.ceil(hours - 3.0);
		}
		if (charge > 10.0)
		{
			charge = 10.0;
		}
		return charge;
	}

}