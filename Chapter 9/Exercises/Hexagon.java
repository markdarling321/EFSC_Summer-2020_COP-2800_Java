public class Hexagon extends Polygon
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Hexagon()
	{
		this.edges = 6;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon";
		this.note = "nuts & bolt heads";
	}

	public void declare()
	{
		System.out.println("public class Hexagon extends Polygon");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}