public class QuadrilateralPyramid extends Pyramid
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public QuadrilateralPyramid()
	{
		this.edges = 8;
		this.faces = 5;
		this.parent = "Shape > Shape3D > Pyramid";
		this.note = "pyramid with 4 sided base";
	}

	public void declare()
	{
		System.out.println("public class QuadrilateralPyramid extends Pyramid");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}
}