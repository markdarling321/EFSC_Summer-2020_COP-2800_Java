public class Triangle extends Polygon
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Triangle()
	{
		this.edges = 3;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon";
		this.note = "3 edges";
	}
	
	public void declare()
	{
		System.out.println("public class Triangle extends Polygon");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}