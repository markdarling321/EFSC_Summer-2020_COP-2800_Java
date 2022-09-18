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

public class EquilateralTriangle extends Triangle
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;

	// DEFAULT CONSTRUCTOR
	public EquilateralTriangle()
	{
		super();
		this.parent = "Shape > Shape2D > Polygon > Triangle";
		this.note = "equilateral triangle";
	}

	// 1 VARIABLE CONSTRUCTOR
	public EquilateralTriangle(double base)
	{
		super(base);
		this.parent = "Shape > Shape2D > Polygon > Triangle";
		this.note = "equilateral triangle";
	}

	@Override
	public void declare()
	{
		System.out.println("public class EquilateralTriangle extends Triangle");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
}