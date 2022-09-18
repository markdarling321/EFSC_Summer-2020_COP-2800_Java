public class Cube extends RectangularPrism
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Cube()
	{
		this.edges = 12;
		this.faces = 6;
		this.parent = "Shape > Shape3D > Prism > Rectangular Prism > Cube";
		this.note = "6 squares";
	}

	public void declare()
	{
		System.out.println("public class Cube extends Prism");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}