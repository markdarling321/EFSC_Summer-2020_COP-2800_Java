public class Pyramid extends Shape3D
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Pyramid()
	{
		this.edges = -1;
		this.faces = -1;
		this.parent = "Shape > Shape3D";
		this.note = "# of faces = # of edges of base + 1";
	}

	public void declare()
	{
		System.out.println("public class Pyramid extends Shape3D");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}