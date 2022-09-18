////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       07/11/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 9.6  --  SHAPE INHERITANCE HIERARCHY

/*
9.6(Shape Inheritance Hierarchy)

The world of shapes is much richer than the shapes included in the inheritance
hierarchy of Fig.9.3. Write down all the shapes you can think of—both
two-dimensional and three-dimensional—and form them into a more complete Shape
hierarchy with as many levels as possible. Your hierarchy should have class
Shape at the top.Classes TwoDimensionalShape and ThreeDimensionalShape should
extend Shape. Add additional subclasses, such as Quadrilateral and Sphere, at
their correct locations in the hierarchy as necessary.
*/

public class Shape
{
	protected int edges;
	protected int faces;
	protected String parent;
	protected String note;

	// CONSTRUCTOR
	public Shape()
	{
		this.edges = -1;
		this.faces = 1;
		this.parent = "N/A";
		this.note = "Shape";
	}

	public void declare()
	{
		System.out.println("public class Shape");
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
}