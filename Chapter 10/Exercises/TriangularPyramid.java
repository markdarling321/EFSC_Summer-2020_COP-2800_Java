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

public class TriangularPyramid extends Pyramid
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double baseEdge; // THE BASE WILL ALWAYS BE AN EQUILATERAL TRIANGLE
							 // EVEN IF THE 3D UPWARD REACHING FACES ARE NOT
	private double height;
	private double slant;

	// DEFAULT CONSTRUCTOR
	public TriangularPyramid()
	{
		this.edges = 6;
		this.faces = 4;
		this.parent = "Shape > Shape3D > Pyramid";
		this.note = "pyramid with 3 edged polygonal base";
		this.baseEdge = -1;
		this.height = -1;
		this.slant = -1;
	}

	// 2 VARIABLE CONSTRUCTOR
	public TriangularPyramid(double baseEdge, double height)
	{
		this();
		this.baseEdge = baseEdge;
		this.height = height;
	}

	// 3 VARIABLE CONSTRUCTOR
	public TriangularPyramid(double baseEdge, double height, double slant)
	{
		this();
		this.baseEdge = baseEdge;
		this.height = height;
		this.slant = slant;
	}

	@Override
	public void declare()
	{
		System.out.println("public class TriangularPyramid extends Pyramid");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
	
	@Override
	public double getArea()
	{
		if (slant == -1) // SINCE WE WERE NOT GIVEN A SLANT LENGTH/HEIGHT, WE ASSUME
		{ 				 // THIS IS A RIGHT TRIANGULAR PYRAMID AND USE PYTHAGOREAN THEOREM
						 // TO DETERMINE THE SLANT HEIGHT

			// BASE AREA: (SQRT(3)/4) * S^2
			double baseArea = (((Math.sqrt(3)) / (4)) * (Math.pow(baseEdge, 2)));

			// APOTHEM (HEIGHT OF 2D) EQUILATERAL TRIANGLE: A = (S/2) * SQRT(3)
			double apothem = (baseEdge / 2) * Math.sqrt(3);

			// SLANT HEIGHT: SQRT((APOTHEM/2)^2 + H^2) AKA: PYTHAGOREAN THEOREM
			double slantHeight = Math.sqrt(Math.pow((apothem / 2), 2) + Math.pow(height, 2));

			// AREA: BASE AREA + (1/2) * (BASE EDGE * 3) * SLANT HEIGHT
			double area = ((baseArea) + ((1 / 2) * ((baseEdge) * (3)) * (slantHeight)));

			return area;
		} 
		else
		{
			// BASE AREA: (SQRT(3)/4) * S^2
			double baseArea = (((Math.sqrt(3)) / (4)) * (Math.pow(baseEdge, 2)));

			// AREA: BASE AREA + (1/2) * (BASE EDGE * 3) * SLANT HEIGHT
			double area = ((baseArea) + ((1 / 2) * ((baseEdge) * (3)) * (slant)));

			return area;
		}
	}

	@Override
	public double getVolume()
	{
		// BASE AREA: (SQRT(3)/4) * S^2
		double baseArea = (((Math.sqrt(3)) / (4)) * (Math.pow(baseEdge, 2)));
		
		// VOLUME: (1/3) * BASE AREA * HEIGHT
		double volume = ((1/3) * (baseArea) * (height));

		return volume;
	}
}