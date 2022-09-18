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

public class Circle extends Shape2D
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double radius;

	// DEFAULT CONSTRUCTOR
	public Circle()
	{
		this.edges = 1;
		this.faces = 1;
		this.parent = "Shape > Shape2D";
		this.note = "perfectly round, 360 degrees, not a polygon";
		this.radius = -1;
	}

	// 1 VARIABLE CONSTRUCTOR
	public Circle(double radius)
	{
		this();
		this.radius = radius;
	}

	@Override
	public void declare()
	{
		System.out.println("public class Circle extends Shape2D");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
	
	@Override
	public double getArea()
	{
		// AREA: PI * R^2
		double area = ((Math.PI) * Math.pow(radius, 2));
		
		return area;
	}
}