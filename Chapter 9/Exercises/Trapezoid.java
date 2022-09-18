public class Trapezoid extends Quadrilateral
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Trapezoid()
	{
		this.edges = 4;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon > Quadrilateral";
		this.note = "1 set of parallel edges";
	}
	
	public void declare()
	{
		System.out.println("public class Trapezoid extends Quadrilateral");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}