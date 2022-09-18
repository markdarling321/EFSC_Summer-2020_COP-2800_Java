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

public class QuadrilateralPyramid extends Pyramid
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double baseLength;
	private double baseWidth;
	private double height;
	private double slant;

	// DEFAULT CONSTRUCTOR
	public QuadrilateralPyramid()
	{
		this.edges = 8;
		this.faces = 5;
		this.parent = "Shape > Shape3D > Pyramid";
		this.note = "pyramid with 4 sided base";
		this.baseLength = -1;
		this.baseWidth = -1;
		this.height = -1;
		this.slant = -1;
	}

	// 4 VARIABLE CONSTRUCTOR
	public QuadrilateralPyramid(double baseLength, double baseWidth, double height, double slant)
	{
		this();
		this.baseLength = baseLength;
		this.baseWidth = baseWidth;
		this.height = height;
		this.slant = slant;
	}

	@Override
	public void declare()
	{
		System.out.println("public class QuadrilateralPyramid extends Pyramid");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}

	@Override
	public double getArea()
	{
		// BASE AREA: (BASE LENGTH) * (BASE WIDTH)
		double baseArea = (baseLength * baseWidth);

		// PERIMETER: ((BASE LENGTH) * 2) + ((BASE WIDTH) * 2)
		double perimeter = (baseLength * 2) + (baseWidth * 2);

		// SURFACE AREA: (BASE AREA) + ((1/2) * (PERIMETER) * (SLANT HEIGHT))
		double area = baseArea + ((1/2) * (perimeter) * (slant));

		return area;
	}

	@Override
	public double getVolume()
	{
		// BASE AREA: (BASE LENGTH) * (BASE WIDTH)
		double baseArea = (baseLength * baseWidth);

		// VOLUME: (1/3) * (BASE AREA) * (HEIGHT)
		double volume = (1/3) * (baseArea) * (height);

		return volume;
	}
}