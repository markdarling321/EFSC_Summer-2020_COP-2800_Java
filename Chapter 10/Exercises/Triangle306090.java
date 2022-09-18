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

public class Triangle306090 extends RightTriangle
{
	// private int edges;
	// private int faces;
	// private String parent;
	// private String note;

	// DEFAULT CONSTRUCTOR
	public Triangle306090()
	{
		super();
		this.parent = "Shape > Shape2D > Polygon > Triangle > RightTriangle";
		this.note = "30-60-90 triangle";
	}

	// 2 VARIABLE CONSTRUCTOR
	public Triangle306090(double base, double height)
	{
		super(base, height);
		this.parent = "Shape > Shape2D > Polygon > Triangle > RightTriangle";
		this.note = "30-60-90 triangle";
	}

	// 3 VARIABLE CONSTRUCTOR
	public Triangle306090(double side1, double side2, double side3)
	{
		super(side1, side2, side3);
		this.parent = "Shape > Shape2D > Polygon > Triangle > RightTriangle";
		this.note = "30-60-90 triangle";
	}

	@Override
	public void declare()
	{
		System.out.println("public class Triangle306090 extends RightTriangle");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
}