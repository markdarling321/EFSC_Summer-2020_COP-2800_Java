public class Cylinder extends Shape3D
{
	private int edges;
	private int faces;
	private String parent;
	private String note;

	// CONSTRUCTOR
	public Cylinder()
	{
		this.edges = 3;
		this.faces = 3;
		this.parent = "Shape > Shape3D > Cylinder";
		this.note = "tall 3D circular prism";
	}
	
	public void declare()
	{
		System.out.println("public class Cylinder extends Shape3D");
		super.declare();
		System.out.printf("\tEDGES:\t%d\n\tFACES:\t%d\n\tPARENT:\t%s\n\tNOTE:\t%s\n\n\n",
							this.edges, this.faces,	this.parent, this.note);
	}	
}