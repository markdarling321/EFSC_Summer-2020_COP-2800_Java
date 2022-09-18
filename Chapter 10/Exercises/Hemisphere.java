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

public class Hemisphere extends Sphere
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double radius;
	
	// DEFAULT CONSTRUCTOR
	public Hemisphere()
	{
		super();
		this.faces = 2;
		this.parent = "Shape > Shape3D > Sphere";
		this.note = "half of a ball";
	}
		
	// 1 VARIABLE CONSTRUCTOR
	public Hemisphere(double radius)
	{
		this(); // CALL DEFAULT CONSTRUCTOR FIRST
		this.radius = radius;
	}

	@Override
	public void declare()
	{
		System.out.println("public class Hemisphere extends Sphere");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
	
	@Override
	public double getArea()
	{
		// BASE: PI * R^2
		double base = ((Math.PI) * Math.pow(radius, 2));
		
		// CAP: 2 * PI * R^2
		double cap = ((2) * (Math.PI) * (Math.pow(radius, 2)));
		
		double area = base + cap;
		
		return area;
	}
	
	@Override
	public double getVolume()
	{
		// VOLUME: 2/3 * PI * R^3
		double volume = ((2/3D) * (Math.PI) * (Math.pow(radius, 3)));
		
		return volume;
	}
}