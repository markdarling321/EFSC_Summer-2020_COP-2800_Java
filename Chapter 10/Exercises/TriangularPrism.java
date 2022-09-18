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

public class TriangularPrism extends Prism
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double triBase;
	private double triHeight;
	private double prismLength;
	private double edge1;
	private double edge2;
	private double edge3;

	// DEFAULT CONSTRUCTOR
	public TriangularPrism()
	{
		this.edges = 9;
		this.faces = 5;
		this.parent = "Shape > Shape3D > Prism";
		this.note = "a triangle extrusion";
		this.triBase = -1;
		this.triHeight = -1;
		this.prismLength = -1;
		this.edge1 = -1;
		this.edge2 = -1;
		this.edge3 = -1;
	}

	// 2 VARIABLE CONSTRUCTOR (equilateral triangle faces assumed)
	public TriangularPrism(double triBase, double prismLength)
	{
		this();
		this.triBase = triBase;
		this.prismLength = prismLength;
	}

	// 3 VARIABLE CONSTRUCTOR (only works for isosceles or equilateral triangle faces)
	public TriangularPrism(double triBase, double triHeight, double prismLength)
	{
		this();
		this.triBase = triBase;
		this.triHeight = triHeight;
		this.prismLength = prismLength;
	}

	// 4 VARIABLE CONSTRUCTOR (will work for any type of triangle face)  --  IMPLEMENT THIS LATER!
	public TriangularPrism(double edge1, double edge2, double edge3, double prismLength)
	{
		this();
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
		this.prismLength = prismLength;
	}

	@Override
	public void declare()
	{
		System.out.println("public class TriangularPrism extends Prism");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}

	@Override
	public double getArea()
	{
		// 2 VARIABLE CONSTRUCTOR WAS USED, EQUILATERAL TRIANGLE ASSUMED
		if (triHeight == -1)
		{
			// SINGLE PRIMARY FACE AREA: (SQRT(3) / 4) * (BASE)^2
			double faceArea = ((Math.sqrt(3)/4) * Math.pow(triBase,2));

			// SINGLE PRISM FACE AREA: (BASE) * (PRISM LENGTH)
			double prismArea = triBase * prismLength;

			// AREA: ((PRIMARY FACE AREA) * 2) + ((PRISM FACE AREA) * 3)
			double area = ((faceArea * 2) + (prismArea * 3));

			return area;
		}

		// 3 VARIABLE CONSTRUCTOR WAS USED, EQUILATERAL OR ISOSCELES TRIANGLE ARE VALID
		else if (triHeight != -1 && (edge1 == -1 && edge2 == -1 && edge3 == -1))
		{
			// SINGLE PRIMARY FACE AREA: (1/2) * (BASE) * (HEIGHT)
			double faceArea = (1/2) * triBase * triHeight;

			// DETERMINE S2/S3 USING PYTHAGOREAN THEOREM: SQRT( (BASE)^2 + (HEIGHT)^2) )
			double altEdge = Math.sqrt(Math.pow(triBase,2) + Math.pow(triHeight,2));

			// BASE PRISM FACE AREA: (BASE) * (PRISM LENGTH)
			double baseFace = triBase * prismLength;

			// ALT PRISM FACE AREA: (ALT EDGE) * (PRISM LENGTH) * (2)
			double altFace = altEdge * prismLength * 2;

			// TOTAL SURFACE AREA: ((FACE AREA) * (2)) + (BASE PRISM FACE AREA) + ((ALT PRISM FACE AREA) * (2))
			double area = ((faceArea * 2) + (baseFace) + (altFace * 2));
			
			return area;
		}

		// 4 VARIABLE CONSTRUCTOR WAS USED, ANY TRIANGLE TYPE IS VALID
		else
		{
			// IMPLEMENT THIS LATER!!!

			double area = -1;
			return area;
		}
	}

	@Override
	public double getVolume()
	{
		// 2 VARIABLE CONSTRUCTOR WAS USED, EQUILATERAL TRIANGLE ASSUMED
		if (triHeight == -1)
		{
			// SINGLE PRIMARY FACE AREA: (SQRT(3) / 4) * (BASE)^2
			double faceArea = ((Math.sqrt(3) / 4) * Math.pow(triBase, 2));

			// VOLUME: (PRIMARY FACE AREA) * (PRISM LENGTH)
			double volume = faceArea * prismLength;

			return volume;
		}

		// 3 VARIABLE CONSTRUCTOR WAS USED, EQUILATERAL OR ISOSCELES TRIANGLE ARE VALID
		else if (triHeight != -1 && (edge1 == -1 && edge2 == -1 && edge3 == -1))
		{
			// SINGLE PRIMARY FACE AREA: (1/2) * (BASE) * (HEIGHT)
			double faceArea = (1 / 2) * triBase * triHeight;
			
			// VOLUME: (PRIMARY FACE AREA) * (PRISM LENGTH)
			double volume = faceArea * prismLength;

			return volume;
		}

		// 4 VARIABLE CONSTRUCTOR WAS USED, ANY TRIANGLE TYPE IS VALID
		else
		{
			// IMPLEMENT THIS LATER!!!

			double volume = -1;
			return volume;
		}
	}
}