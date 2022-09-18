public class Polygon extends Shape2D
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Polygon()
	{
		this.edges = -1;
		this.faces = 1;
		this.parent = "Shape > Shape2D";
		this.note = "3 or more connected edges";
	}
	
	public void declare()
	{
		System.out.println("public class Polygon extends Shape2D");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}