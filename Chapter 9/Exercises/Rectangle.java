public class Rectangle extends Parallelogram
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Rectangle()
	{
		this.edges = 4;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon > Quadrilateral > Parallelogram";
		this.note = "2 pairs of equal edges";
	}

	public void declare()
	{
		System.out.println("public class Rectangle extends Parallelogram");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}