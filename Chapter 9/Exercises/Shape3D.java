public class Shape3D extends Shape
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Shape3D()
	{
		this.edges = -1;
		this.faces = -1;
		this.parent = "Shape";
		this.note = "Shape3D";
	}

	public void declare()
	{
		System.out.println("public class Shape3D extends Shape");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}