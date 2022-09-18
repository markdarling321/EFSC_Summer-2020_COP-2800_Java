public class EquilateralTriangle extends Triangle
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public EquilateralTriangle()
	{
		this.edges = 3;
		this.faces = 1;
		this.parent = "Shape > Shape2D > Polygon > Triangle";
		this.note = "equilateral";
	}

	public void declare()
	{
		System.out.println("public class EquilateralTriangle extends Triangle");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces, this.parent, this.note);
	}
}