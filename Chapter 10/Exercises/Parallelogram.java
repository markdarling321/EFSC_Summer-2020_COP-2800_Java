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

public class Parallelogram extends Quadrilateral
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double edge;
	private double edge1;
	private double edge2;
	private double edge3;
	private double edge4;
	private double edgePair1;
	private double edgePair2;

	// DEFAULT CONSTRUCTOR
	public Parallelogram()
	{
		super();
		this.parent = "Shape > Shape2D > Polygon > Quadrilateral";
		this.note = "a quadrilateral with 2 sets of parallel sides";
		this.edge = -1;
		this.edge1 = -1;
		this.edge2 = -1;
		this.edge3 = -1;
		this.edge4 = -1;
		this.edgePair1 = -1;
		this.edgePair2 = -1;
	}

	// 1 VARIABLE CONSTRUCTOR (a square)
	public Parallelogram(double edge)
	{
		this();
		this.edge = edge;
	}

	// 2 VARIABLE CONSTRUCTOR (a rectangle / parallelogram / diamond / square / etc)
	public Parallelogram(double edgePair1, double edgePair2)
	{
		this();
		this.edgePair1 = edgePair1;
		this.edgePair2 = edgePair2;
	}

	// 4 VARIABLE CONSTRUCTOR (a quadrilateral polygon)
	public Parallelogram(double edge1, double edge2, double edge3, double edge4)
	{
		this();
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
		this.edge4 = edge4;
	}

	@Override
	public void declare()
	{
		System.out.println("public class Parallelogram extends Quadrilateral");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}	

	@Override
	public double getArea()
	{
		// 1 VARIABLE CONSTRUCTOR WAS CALLED (this is a square)
		if (edge != -1)
		{
			// AREA: (EDGE)^2
			double area = Math.pow(edge, 2);

			return area;
		}
		// 2 VARIABLE CONSTRUCTOR WAS CALLED (this is a rectangle)
		else if (edgePair1 != -1 && edgePair2 != -1)
		{
			// AREA: (EDGEPAIR1) * (EDGEPAIR2)
			double area = edgePair1 * edgePair2;

			return area;
		}
		// 4 VARIABLE CONSTRUCTOR WAS CALLED (this could be any type of quadrilateral)
		else if (edge1 != -1 && edge2 != -1 && edge3 != -1 && edge4 != -1)
		{
			// IMPLEMENT THIS FUNCTIONALITY LATER!!!
			return -1;
		}
		// ERROR! NO COMPATIBLE SET OF PARAMETERS WERE PASSED
		else
		{
			return -1;
		}
	}
}