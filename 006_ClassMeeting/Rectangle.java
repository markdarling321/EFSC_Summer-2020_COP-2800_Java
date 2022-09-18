// CHAPTER 8
// EXERCISE 8.4

/*

8.4 (Rectangle Class) Create a class Rectangle with attributes length and width,
each of which defaults to 1. Provide methods that calculate the rectangle’s
perimeter and area. It has set and get methods for both length and width. The
set methods should verify that length and width are each floating-point numbers
larger than 0.0 and less than 20.0. Write a program to test class Rectangle.

*/

public class Rectangle
{
	private double length;
	private double width;

	// DEFAULT CONSTRUCTOR
	public Rectangle()
	{
		this(1.0, 1.0);
	}

	// EXPLICIT CONSTRUCTOR
	public Rectangle(double l, double w)
	{
		if (l <= 0.0 || l >= 20.0)
		{
			throw new IllegalArgumentException("length out of range");
		}

		if (w <= 0.0 || w >= 20.0)
		{
			throw new IllegalArgumentException("width out of range");
		}
		this.length = l;
		this.width = w;
	}

	// SET METHOD  --  LENGTH
	public void setLength(double l)
	{
		if (l <= 0.0 || l >= 20.0)
		{
			throw new IllegalArgumentException("length out of range");
		}
		this.length = l;
	}

	// SET METHOD  --  WIDTH
	public void setWidth(double w)
	{
		if (w <= 0.0 || w >= 20.0)
		{
			throw new IllegalArgumentException("width out of range");
		}
		this.width = w;
	}

	// GET METHOD  --  LENGTH
	public double getLength()
	{
		return length;
	}
	
	// GET METHOD  --  WIDTH
	public double getWidth()
	{
		return width;
	}
	
	// GET METHOD  --  PERIMETER
	public double getPerimeter()
	{
		return ((2 * getLength()) + (2 * getWidth()));
	}

	// GET METHOD  --  AREA
	public double getArea()
	{
		return getLength() * getWidth();
	}

	// PRINT METHOD  --  OUTPUT ALL VARIABLES TO SCREEN
	public String toString()
	{
		return String.format("%n%s: %f%n%s: %f%n%s: %f%n%s: %f",
				"Length", getLength(), 
				"Width", getWidth(), 
				"Perimeter", getPerimeter(),
				"Area", getArea()
				);
	}
}