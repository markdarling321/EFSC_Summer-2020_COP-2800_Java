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

public class Square extends Parallelogram
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;

	// DEFAULT CONSTRUCTOR
	public Square()
	{
		super();
		this.parent = "Shape > Shape2D > Polygon > Quadrilateral > Parallelograms";
		this.note = "regular quadrilateral";
	}

	// 1 VARIABLE CONSTRUCTOR (a square)
	public Square(double edge)
	{
		super(edge);
		this.parent = "Shape > Shape2D > Polygon > Quadrilateral > Parallelograms";
		this.note = "regular quadrilateral";
	}

	// 2 VARIABLE CONSTRUCTOR (a rectangle / parallelogram / diamond / square / etc)
	public Square(double edgePair1, double edgePair2)
	{
		super(edgePair1, edgePair2);
		this.parent = "Shape > Shape2D > Polygon > Quadrilateral > Parallelograms";
		this.note = "regular quadrilateral";
	}

	// 4 VARIABLE CONSTRUCTOR (a quadrilateral polygon)
	public Square(double edge1, double edge2, double edge3, double edge4)
	{
		super(edge1, edge2, edge3, edge4);
		this.parent = "Shape > Shape2D > Polygon > Quadrilateral > Parallelograms";
		this.note = "regular quadrilateral";
	}

	@Override
	public void declare()
	{
		System.out.println("public class Square extends Parallelogram");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
}