public class TriangularPyramid extends Pyramid
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public TriangularPyramid()
	{
		this.edges = 4;
		this.faces = 4;
		this.parent = "Shape > Shape3D > Pyramid";
		this.note = "pyramid with 3 sided base";
	}

	public void declare()
	{
		System.out.println("public class TriangularPyramid extends Pyramid");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}