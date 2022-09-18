public class TriangularPrism extends Prism
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public TriangularPrism()
	{
		this.edges = 9;
		this.faces = 5;
		this.parent = "Shape > Shape3D > Prism";
		this.note = "a triangle extrusion";
	}

	public void declare()
	{
		System.out.println("public class TriangularPrism extends Prism");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}