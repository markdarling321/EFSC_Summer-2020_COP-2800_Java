////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/25/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 3.12  --  INVOICE CLASS

/* DESCRIPTION:

3.12 (Invoice Class)

Create a class called Invoice that a hardware store might use to represent an
invoice for an item sold at the store. An Invoice should include four pieces
of information as instance variables—a part number (type String), a part
description (type String), a quantity of the item being purchased (type int)
and a price per item (double). Your class should have a constructor that
initializes the four instance variables. Provide a set and a get method for
each instance variable. In addition, provide a method named getInvoiceAmount
that calculates the invoice amount (i.e., multiplies the quantity by the price
per item), then returns the amount as a double value. If the quantity is not
positive, it should be set to 0. If the price per item is not positive, it
should be set to 0.0. Write a test app named InvoiceTest that demonstrates
class Invoice’s capabilities.

*/

import java.util.Scanner;	// FOR TAKING USER INPUT

public class InvoiceTest
{
	public static void main(String args[])	// BEING MAIN DRIVER PROGRAM HERE
	{
		// CREATE SCANNER INPUT STREAM OBJECT TO OBTAIN INPUT FROM USER
		Scanner input = new Scanner(System.in);

		// CREATE INVOICE() CLASS OBJECTS
		Invoice invoice1 = new Invoice("pn1234", "pdABC", 13, 3.99);
		Invoice invoice2 = new Invoice("pn2345", "pdDEF", 8, 6.79);
		Invoice invoice3 = new Invoice("pn3456", "pdGHI", -3, 4.50);
		Invoice invoice4 = new Invoice("pn4567", "pdJKL", 2, -5.38);
		Invoice invoice5 = new Invoice();

		// DISPLAY TABLE OF INVOICE DETAILS USING GET FUNCTIONS
		System.out.printf("INVOICE # \t PART # \t PART DESCRIPTION \t QTY \t\t PRICE \t\t INVOICE TOTAL \n\n");
		System.out.printf("INVOICE 1 \t %s \t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n", 
				invoice1.getPartNum(), 
				invoice1.getpartDesc(),
				invoice1.getQty(),
				invoice1.getPrice(),
				invoice1.getInvoiceAmount()
		);
		System.out.printf("INVOICE 2 \t %s \t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n",
				invoice2.getPartNum(), 
				invoice2.getpartDesc(),
				invoice2.getQty(), 
				invoice2.getPrice(),
				invoice2.getInvoiceAmount()
		);
		System.out.printf("INVOICE 3 \t %s \t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n",
				invoice3.getPartNum(), 
				invoice3.getpartDesc(),
				invoice3.getQty(), 
				invoice3.getPrice(),
				invoice3.getInvoiceAmount()
		);
		System.out.printf("INVOICE 4 \t %s \t %s \t\t\t %d \t\t $%.2f \t $%.2f \n",
				invoice4.getPartNum(), 
				invoice4.getpartDesc(),
				invoice4.getQty(), 
				invoice4.getPrice(),
				invoice4.getInvoiceAmount()
		);
		System.out.printf("INVOICE 5 \t %s \t\t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n",
				invoice5.getPartNum(), 
				invoice5.getpartDesc(),
				invoice5.getQty(), 
				invoice5.getPrice(),
				invoice5.getInvoiceAmount()
		);

		// UPDATE INVOICE #5 USING SET FUNCTIONS
		System.out.printf("\n\n NOW UPDATING INVOICE #5... \n\n");
		System.out.printf("\t ENTER PART NUMBER: ");
		invoice5.setPartNum(input.nextLine());
		System.out.printf("\t ENTER PART DESCRIPTION: ");
		invoice5.setPartDesc(input.nextLine());
		System.out.printf("\t ENTER QUANTITY: ");
		invoice5.setQty(input.nextInt());
		System.out.printf("\t ENTER PRICE: ");
		invoice5.setPrice(input.nextDouble());

		// SKIP A LINE
		System.out.println();
		System.out.println();

		// DISPLAY UPDATED TABLE OF INVOICE DETAILS USING GET FUNCTIONS
		System.out.printf("INVOICE # \t PART # \t PART DESCRIPTION \t QTY \t\t PRICE \t\t INVOICE TOTAL \n\n");
		System.out.printf("INVOICE 1 \t %s \t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n", invoice1.getPartNum(),
				invoice1.getpartDesc(), invoice1.getQty(), invoice1.getPrice(), invoice1.getInvoiceAmount());
		System.out.printf("INVOICE 2 \t %s \t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n", invoice2.getPartNum(),
				invoice2.getpartDesc(), invoice2.getQty(), invoice2.getPrice(), invoice2.getInvoiceAmount());
		System.out.printf("INVOICE 3 \t %s \t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n", invoice3.getPartNum(),
				invoice3.getpartDesc(), invoice3.getQty(), invoice3.getPrice(), invoice3.getInvoiceAmount());
		System.out.printf("INVOICE 4 \t %s \t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n", invoice4.getPartNum(),
				invoice4.getpartDesc(), invoice4.getQty(), invoice4.getPrice(), invoice4.getInvoiceAmount());
		System.out.printf("INVOICE 5 \t %s \t %s \t\t\t %d \t\t $%.2f \t\t $%.2f \n", invoice5.getPartNum(),
				invoice5.getpartDesc(), invoice5.getQty(), invoice5.getPrice(), invoice5.getInvoiceAmount());

			
		// SKIP LINES BEFORE PAKTC
		System.out.println();
		System.out.println();

		// CLOSE INPUT STREAM TO AVOID RESOURCE LEAKS
		input.close();
	} // END MAIN DRIVER PROGRAM HERE
} // END CLASS CONTAINING MAIN DRIVER PROGRAM