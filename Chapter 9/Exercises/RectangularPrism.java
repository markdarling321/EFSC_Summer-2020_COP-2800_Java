public class RectangularPrism extends Prism
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONTSTRUCTOR
	public RectangularPrism()
	{
		this.edges = 12;
		this.faces = 6;
		this.parent = "Shape > Shape3D > Prism";
		this.note = "3D rectangle";
	}

	public void declare()
	{
		System.out.println("public class RectangularPrism extends Prism");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}