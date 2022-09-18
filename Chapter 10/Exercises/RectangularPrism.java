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

public class RectangularPrism extends Prism
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double faceLength;
	private double faceWidth;
	private double prismLength;

	// DEFAULT CONTSTRUCTOR
	public RectangularPrism()
	{
		this.edges = 12;
		this.faces = 6;
		this.parent = "Shape > Shape3D > Prism";
		this.note = "3D rectangle";
		this.faceLength = -1;
		this.faceWidth = -1;
		this.prismLength = -1;
	}

	// 3 VARIABLE CONTSTRUCTOR
	public RectangularPrism(double faceLength, double faceWidth, double prismLength)
	{
		this();
		this.faceLength = faceLength;
		this.faceWidth = faceWidth;
		this.prismLength = prismLength;
	}

	@Override
	public void declare()
	{
		System.out.println("public class RectangularPrism extends Prism");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}

	@Override
	public double getArea()
	{
		// PRIMARY FACE AREA: (FACE LENGTH) * (FACE WIDTH)
		double faceArea = faceLength * faceWidth;

		// PRISM SIDES AREA: ((FACE LENGTH) * (PRISM LENGTH) * 2) + ((FACE WIDTH) * (PRISM LENGTH) * 2)
		double sideArea = (faceLength * prismLength * 2) + (faceWidth * prismLength * 2);

		// TOTAL SURFACE AREA: (FACE AREA) * 2 + (SIDE AREA)
		double area = ((faceArea * 2) + sideArea);

		return area;
	}

	@Override
	public double getVolume()
	{
		// PRIMARY FACE AREA: (FACE LENGTH) * (FACE WIDTH)
		double faceArea = faceLength * faceWidth;

		// VOLUME: (PRIMARY FACE AREA) * (PRISM LENGTH)
		double volume = faceArea * prismLength;

		return volume;
	}
}