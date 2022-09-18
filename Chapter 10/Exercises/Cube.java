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

public class Cube extends RectangularPrism
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double edge;

	// DEFAULT CONSTRUCTOR
	public Cube()
	{
		this.edges = 12;
		this.faces = 6;
		this.parent = "Shape > Shape3D > Prism > Rectangular Prism > Cube";
		this.note = "6 squares";
		this.edge = -1;
	}

	// 1 VARIABLE CONSTRUCTOR
	public Cube(double edge)
	{
		this();
		this.edge = edge;
	}

	@Override
	public void declare()
	{
		System.out.println("public class Cube extends RectangularPrism");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}

	@Override
	public double getArea()
	{
		// SINGLE FACE AREA: (EDGE)^2
		double faceArea = Math.pow(edge,2);

		// TOTAL SURFACE AREA: (FACE AREA) * 6
		double area = faceArea * 6;

		return area;
	}

	@Override
	public double getVolume()
	{
		// VOLUME: (EDGE)^3
		double volume = Math.pow(edge,3);

		return volume;
	}
}