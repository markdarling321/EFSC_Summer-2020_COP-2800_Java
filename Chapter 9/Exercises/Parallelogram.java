public class Parallelogram extends Quadrilateral
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Parallelogram()
	{
		this.edges = 4;
		this.faces = 1;
		this.parent = "Shape > Shape3D > Polygon > Quadrilateral";
		this.note = "2 sets of even edges";
	}

	public void declare()
	{
		System.out.println("public class Parallelogram extends Quadrilateral");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}	
}