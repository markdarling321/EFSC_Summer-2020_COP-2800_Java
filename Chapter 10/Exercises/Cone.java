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

public class Cone extends Shape3D
{
//	private int edges;
//	private int faces;
//	private String parent;
//	private String note;
	private double radius;
	private double height;
	private double slant;

	// DEFAULT CONSTRUCTOR
	public Cone()
	{
		this.edges = 2;
		this.faces = 2;
		this.parent = "Shape > Shape3D";
		this.note = "pyramid with circle for base";
		this.radius = -1;
		this.height = -1;
		this.slant = -1;
	}

	// 2 VARIABLE CONSTRUCTOR (IF SLANT HEIGHT IS UNKNOWN, WE CAN STILL CALCULATE VOLUME)
	// THIS CASE ASSUMES THE CONE IS A RIGHT CIRCLE CONE AND USES PYTHAGOREAN THEOREM TO
	// DETERMINE THE SLANT HEIGHT
	public Cone(double radius, double height)
	{
		this(); // CALL DEFAULT CONSTRUCTOR FIRST
		this.radius = radius;
		this.height = height;
	}

	// 3 VARIABLE CONSTRUCTOR
	public Cone(double radius, double height, double slant)
	{
		this(); // CALL DEFAULT CONSTRUCTOR FIRST
		this.radius = radius;
		this.height = height;
		this.slant = slant;
	}

	@Override
	public void declare()
	{
		System.out.println("public class Cone extends Shape3D");
		//super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
	
	@Override
	public double getArea()
	{
		if (slant == -1) 	// SINCE WE WERE NOT GIVEN A SLANT LENGTH/HEIGHT, WE ASSUME
		{				 	// THIS IS A RIGHT CIRCLE CONE AND USE PYTHAGOREAN THEOREM
							// TO DETERMINE THE SLANT HEIGHT
			
			// BASE: PI * R^2
			double base = ((Math.PI) * Math.pow(radius, 2));

			// SLANT HEIGHT: SQRT(R^2 + H^2)  AKA: PYTHAGOREAN THEOREM
			double slantHeight = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
			
			// AREA: (PI * R * SLANT) + (PI * R^2)
			double area = ((Math.PI * radius * slantHeight) + (base));

			return area;
		}
		else
		{
			// BASE: PI * R^2
			double base = ((Math.PI) * Math.pow(radius, 2));

			// SLANT SA: (PI * R * SLANT)
			double slantSA = (Math.PI * radius * slant);

			// TOTAL AREA: SLANT SA + BASE
			double area = slantSA + base;
			
			return area;
		}
	}

	@Override
	public double getVolume()
	{
		// VOLUME: (PI * R^2 * H) / 3
		double volume = (((Math.PI) * Math.pow(radius, 2) * (height)) / 3);
		
		return volume;
	}
}