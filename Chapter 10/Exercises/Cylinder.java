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

public class Cylinder extends Shape3D
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double radius;
	private double height;

	// DEFAULT CONSTRUCTOR
	public Cylinder()
	{
		this.edges = 3;
		this.faces = 3;
		this.parent = "Shape > Shape3D > Cylinder";
		this.note = "tall 3D circular prism";
		this.radius = -1;
		this.height = -1;
	}
	
	// 2 VARIABLE CONSTRUCTOR
	public Cylinder(double radius, double height)
	{
		this();	// CALL DEFAULT CONSTRUCTOR FIRST
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public void declare()
	{
		System.out.println("public class Cylinder extends Shape3D");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
	
	@Override
	public double getArea()
	{
		// BASE: PI * R^2
		double base = ((Math.PI) * Math.pow(radius, 2));

		// FACE: 2 * pi * r * h
		double face = ((2) * (Math.PI) * (radius) * (height));
		
		// AREA: (2 * BASE) + FACE
		double area = (((2) * (base)) + (face));

		return area;
	}

	@Override
	public double getVolume()
	{
		// BASE: PI * R^2
		double base = ((Math.PI) * Math.pow(radius, 2));

		// VOLUME: BASE * HEIGHT
		double volume = base * height;

		return volume;
	}
}