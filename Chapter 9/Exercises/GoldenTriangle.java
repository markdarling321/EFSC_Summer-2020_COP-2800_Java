public class GoldenTriangle extends IsoscelesTriangle
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public GoldenTriangle()
	{
		this.edges = 3;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon > Triangle > Isosceles Triangle";
		this.note = "AKA: sublime triangle";
	}

	public void declare()
	{
		System.out.println("public class GoldenTriangle extends IsoscelesTriangle");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}