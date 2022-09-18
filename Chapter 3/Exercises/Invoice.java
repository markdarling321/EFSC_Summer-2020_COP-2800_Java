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

public class Invoice
{
	// INSTANCE VARIABLES
	private String partNum;
	private String partDesc;
	private int qty;
	private double price;

	// CONSTRUCTOR WITH NO PARAMETERS
	public Invoice()
	{
		// INITIALIZE INSTANCE VARIABLES
		partNum = "N/A";
		partDesc = "N/A";
		qty = 0;
		price = 0.00;
	}

	// CONSTRUCTOR WITH 4 PARAMETERS
	public Invoice(String partNum, String partDesc, int qty, double price)
	{
		// INITIALIZE INSTANCE VARIABLES
		this.partNum = partNum;
		this.partDesc = partDesc;
		this.qty = qty;
		this.price = price;
	}

	// SET FUNCTIONS
	public void setPartNum(String partNum)
	{
		this.partNum = partNum;
	}

	public void setPartDesc(String partDesc)
	{
		this.partDesc = partDesc;
	}

	public void setQty(int qty)
	{
		this.qty = qty;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	// GET FUNCTIONS
	public String getPartNum()
	{
		return partNum;
	}

	public String getpartDesc()
	{
		return partDesc;
	}

	public int getQty()
	{
		return qty;
	}

	public double getPrice()
	{
		return price;
	}

	public double getInvoiceAmount()
	{	
		double amount;

		// SET QTY TO ZERO IF NEGATIVE
		if (qty < 0)
		{
			qty = 0;
		}

		// SET PRICE TO ZERO IF NEGATIVE
		if (price < 0)
		{
			price = 0;
		}
		
		// CALCULATE AMOUNT DUE
		amount = qty * price;

		return amount;
	}
}