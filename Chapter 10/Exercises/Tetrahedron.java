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

public class Tetrahedron extends TriangularPyramid
{
// private int edges;
// private int faces;
// private String parent;
// private String note;
	private double baseEdge;

	// DEFAULT CONSTRUCTOR
	public Tetrahedron()
	{
		this.edges = -1;
		this.faces = -1;
		this.parent = "Shape > Shape3D > Pyramid > TriangularPyramid ";
		this.note = "regular equilateral triangular pyramid";
		this.baseEdge = -1;
	}

	// 1 VARIABLE CONSTRUCTOR
	public Tetrahedron(double baseEdge)
	{
		this();
		this.baseEdge = baseEdge;
	}

	public void declare()
	{
		System.out.println("public class Tetrahedron extends TriangularPyramid");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}

	@Override
	public double getArea()
	{
		// AREA: SQRT(3) * (EDGE LENGTH)^2
		double area = ((Math.sqrt(3)) * (Math.pow(baseEdge,2)));

		return area;
	}

	@Override
	public double getVolume()
	{
		// VOLUME: (SQRT(2)/12) * (EDGE LENGTH)^3
		double volume = ((Math.sqrt(2)/12) * (Math.pow(baseEdge,3)));
		
		return volume;
	}
}