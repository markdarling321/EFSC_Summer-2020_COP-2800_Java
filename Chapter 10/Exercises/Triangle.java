// EXERCISE 10.14  --  PROJECT: SHAPE HIERARCHY

/*
10.14 (Project: Shape Hierarchy)

Implement the Shape hierarchy shown in Fig. 9.3 . Each TwoDimensionalShape should
contain method getArea to calculate the area of the two-dimensional shape. Each
ThreeDimensionalShape should have methods getArea and getVolume to calculate the
surface area and volume, respectively, of the three-dimensional shape. Create a
program that uses an array of Shape references to objects of each concrete class
in the hierarchy. The program should print a text description of the object to
which each array element refers. Also, in the loop that processes all the shapes
in the array, determine whether each shape is a TwoDimensionalShape or a
ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s
a ThreeDimensionalShape, display its area and volume.
*/

public class Triangle extends Polygon
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double base;
	private double height;
	private double side1;
	private double side2;
	private double side3;

	// DEFAULT CONSTRUCTOR
	public Triangle()
	{
		this.edges = 3;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon";
		this.note = "3 edges";
		this.base = 1;	// THIS WILL RESULT IN A NEGATIVE AREA IF DEFAULT CONSTRUCTOR IS USED
		this.height = -1;
		this.side1 = -1;
		this.side2 = -1;
		this.side3 = -1;
	}

	// 1 VARIABLE CONSTRUCTOR (equilateral triangle assumed)
	public Triangle(double base)
	{
		this();
		this.base = base;
	}

	// 2 VARIABLE CONSTRUCTOR
	public Triangle(double base, double height)
	{
		this();
		this.base = base;
		this.height = height;
	}

	// 3 VARIABLE CONSTRUCTOR
	public Triangle(double side1, double side2, double side3)
	{
		this();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public void declare()
	{
		System.out.println("public class Triangle extends Polygon");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
	
	@Override
	public double getArea()
	{
		// ONLY BASE WAS GIVEN, 1 VARIABLE CONSTRUCTOR USED (equilateral triangle assumed)
		if ((base != -1 && height == -1) && (side1 == -1 && side2 == -1 && side3 == -1))
		{
			// AREA: (SQRT(3) / 4) * (BASE)^2
			double area = (Math.sqrt(3)/4) * Math.pow(base,2);
			
			return area;
		}
		// BASE AND HEIGHT GIVEN, 2 VARIABLE CONSTRUCTOR USED
		else if ((base != -1 && height != -1) && (side1 == -1 && side2 == -1 && side3 == -1))
		{
			// AREA: (1/2) * (BASE) * (HEIGHT)
			double area = ((base * height) / 2);

			return area;
		}
		// 3 VARIABLE CONSTRUCTOR USED (valid for any type of triangle)
		else if ((base == -1 && height == -1) && (side1 != -1 && side2 != -1 && side3 != -1))
		{ // USING HERON'S FORMULA...
			
			// HALF PERIMETER: (1/2) * (SIDE1 + SIDE2 + SIDE3)
			double halfPerimeter = (1/2) * (side1 + side2 + side3);

			// AREA: SQRT( (HALF PERIMETER) * (H.P. - SIDE1) * (H.P. - SIDE2) * (H.P. - SIDE3) )
			double area = Math.sqrt(
									(halfPerimeter)
									* (halfPerimeter - side1)
									* (halfPerimeter - side2)
									* (halfPerimeter - side3));
			return area;
		}
		else // AN ERROR HAS OCURRED!
		{
			return -1;
		}
	}
}