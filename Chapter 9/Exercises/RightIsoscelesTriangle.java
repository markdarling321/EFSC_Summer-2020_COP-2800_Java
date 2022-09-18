public class RightIsoscelesTriangle extends RightTriangle
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public RightIsoscelesTriangle()
	{
		this.edges = 3;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon > Triangle > Right Triangle";
		this.note = "right isosceles";
	}

	public void declare()
	{
		System.out.println("public class IsoscelesRightTriangle extends RightTriangle");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
}