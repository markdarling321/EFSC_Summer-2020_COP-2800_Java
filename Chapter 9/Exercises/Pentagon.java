public class Pentagon extends Polygon
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Pentagon()
	{
		this.edges = 5;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon";
		this.note = "5 edges";
	}

	public void declare()
	{
		System.out.println("public class Pentagon extends Polygon");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}