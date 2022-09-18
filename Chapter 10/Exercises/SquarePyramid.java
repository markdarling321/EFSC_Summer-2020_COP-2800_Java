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

public class SquarePyramid extends QuadrilateralPyramid
{
	// private int edges;
	// private int faces;
	// private String parent;
	// private String note;
	private double baseEdge;
	private double height;
	private double slant;

	// DEFAULT CONSTRUCTOR
	public SquarePyramid()
	{
		this.edges = 8;
		this.faces = 5;
		this.parent = "Shape > Shape3D > Pyramid";
		this.note = "pyramid with 4 sided base";
		this.baseEdge = -1;
		this.height = -1;
		this.slant = -1;
	}

	// 2 VARIABLE CONSTRUCTOR (implement later)
//	public SquarePyramid(double baseEdge, double height)
//	{
//		this();
//		this.baseEdge = baseEdge;
//		this.height = height;
//	}

	// 3 VARIABLE CONSTRUCTOR
	public SquarePyramid(double baseEdge, double height, double slant)
	{
		this();
		this.baseEdge = baseEdge;
		this.height = height;
		this.slant = slant;
	}

	public void declare()
	{
		System.out.println("public class QuadrilateralPyramid extends Pyramid");
		// super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}

	@Override
	public double getArea()
	{
		// BASE AREA: (BASE EDGE)^2
		double baseArea = Math.pow(baseEdge, 2);

		// PERIMETER: (BASE EDGE) * 4
		double perimeter = (baseEdge * 4);

		// SURFACE AREA: (BASE AREA) + ((1/2) * (PERIMETER) * (SLANT HEIGHT))
		double area = ((baseArea) + ((1/2) * (perimeter) * (slant)));

		return area;
	}

	@Override
	public double getVolume()
	{
		// BASE AREA: (BASE EDGE)^2
		double baseArea = Math.pow(baseEdge, 2);

		// VOLUME: (1/3) * (BASE AREA) * (HEIGHT)
		double volume = (1 / 3) * (baseArea) * (height);

		return volume;
	}
}