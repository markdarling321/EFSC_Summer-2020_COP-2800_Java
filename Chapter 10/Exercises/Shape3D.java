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

public abstract class Shape3D implements Shape
{

	protected int edges;
	protected int faces;
	protected String parent;
	protected String note;

	// DEFAULT CONSTRUCTOR
	protected Shape3D() // INITIALIZE INSTANCE VARIABLES TO OBJECT'S DEFAULT STATE
	{
		this.edges = -1;
		this.faces = -1;
		this.parent = "Shape";
		this.note = "Shape3D";
	}

	@Override
	public void declare() // ABSTRACT CLASSES CAN CONTAIN NON-ABSTRACT METHODS
	{
		System.out.println("public abstract class Shape3D implements Shape");
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
	
	public abstract double getArea(); // ALL SUBCLASSES OF Shape3D WILL BE ABLE TO getArea()
									  // BUT THE IMPLEMENTATION DETAILS WILL VARY FROM ONE
									  // SHAPE TO ANOTHER
	
	public abstract double getVolume(); // ALL SUBCLASSES OF Shape3D WILL BE ABLE TO getVolume()
										// BUT THE IMPLEMENTATION DETAILS WILL VARY FROM ONE
										// SHAPE TO ANOTHER
}