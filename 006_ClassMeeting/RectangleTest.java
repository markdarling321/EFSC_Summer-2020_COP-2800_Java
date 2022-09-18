// CHAPTER 8
// EXERCISE 8.4

/*

8.4 (Rectangle Class) Create a class Rectangle with attributes length and width,
each of which defaults to 1. Provide methods that calculate the rectangle’s
perimeter and area. It has set and get methods for both length and width. The
set methods should verify that length and width are each floating-point numbers
larger than 0.0 and less than 20.0. Write a program to test class Rectangle.

*/

import java.util.Scanner;

public class RectangleTest
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Rectangle r1 = new Rectangle();

		int choice = getMenuChoice();
		while (choice != 3)
		{
			try
			{
				switch (choice)
				{
				case 1:
					System.out.print("Enter length: ");
					r1.setLength(input.nextDouble());
					break;
				case 2:
					System.out.print("Enter width: ");
					r1.setWidth(input.nextDouble());
					break;
				}
				System.out.println(r1.toString());
			} catch (IllegalArgumentException e)
			{
				System.out.printf("length and width must be 0.0 to 20.0%n");
			}
			choice = getMenuChoice();
		}
		input.close();
	}

	private static int getMenuChoice()
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("%n1. Set Length%n");
		System.out.println("2. set Width");
		System.out.println("3. Exit");
		System.out.print("Choice: ");
		return input.nextInt();
	}
}